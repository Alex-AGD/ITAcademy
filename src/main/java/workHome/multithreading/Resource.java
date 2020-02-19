package main.java.workHome.multithreading;

public class Resource {
    static int i; //нельзя исполз статич переменную на уровне обьекта

    private int j; //можно взять обычную для нашего метода changeI

    public synchronized static void changeStaticI() {
        synchronized (Resource.class) {
            int i = Resource.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }

        public  void changeI() { // synchronized говорит о том даже если поток оборвется другой не может в него
            //зайти наш поток будет Lock(Monitor)
            synchronized (this) {
                int j = Resource.i; // можем выбирать какой блок мы хотим synchronized
                if (Thread.currentThread().getName().equals("one")) {
                    Thread.yield();
                }
                j++;
                Resource.i = j;
            }
        }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        Resource.i = i;
    }
}
