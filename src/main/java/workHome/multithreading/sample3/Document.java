package workHome.multithreading.sample3;

public class Document {
    private volatile byte[] data;

    public boolean isReady(){
        return data !=null;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
