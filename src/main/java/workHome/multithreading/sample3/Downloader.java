package main.java.workHome.multithreading.sample3;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Downloader extends Thread {
    private final String link;
    private final Document doc;

    public Downloader(String link, Document doc) {
        this.link = link;
        this.doc = doc;
    }

    @Override
    public void run() {
        System.out.println("Downloading file... ");
        synchronized (doc) {
            byte[] data = new byte[0];
            try {
                data = downloadFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (data == null)
                throw new RuntimeException("Download failed");


            doc.setData(data);
            doc.notifyAll();

        }
    }

    private byte[] downloadFile() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        URL url = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        InputStream stream = connection.getInputStream();
        byte[] buf = new byte[1024];
        int read;

        while ((read = stream.read(buf)) != -1) {
            bos.write(buf, 0, read);

            connection.disconnect();
        }

return bos.toByteArray();
    }
}
