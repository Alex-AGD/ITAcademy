package main.java.workHome.multithreading;

public class Resource {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public synchronized void changeI() { // synchronized говорит о том даже если поток оборвется другой не может в него
        //зайти наш поток будет Lock(Monitor)
        synchronized (this) {
            int i = this.i; // можем выбирать какой блок мы хотим synchronized
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            this.i = i;

        }

    }
}
