package main.java.workHome.multithreading.sample3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer extends Thread {
    private final Document doc;
    private final String path;




    public Writer(Document doc, String path) {
        this.doc = doc;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("Writing document to " + path);

        synchronized (doc) {
            while (!doc.isReady()) {
                try {
                    doc.wait();
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
        try(FileOutputStream fos = new FileOutputStream(path)){
            fos.write(doc.getData());
            System.out.println("Done: "+ path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error " + e);        }
    }
}




