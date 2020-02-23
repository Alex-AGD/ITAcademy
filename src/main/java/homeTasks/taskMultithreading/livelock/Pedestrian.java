package main.java.homeTasks.taskMultithreading.livelock;

public class Pedestrian extends Thread {
    private Object l;
    private Object r;
    private Pedestrian other;
    private Object current;

    Pedestrian(Object left, Object right, int firstDirection) {
        l = left;
        r = right;
        if (firstDirection == 0) {
            current = l;
        } else {
            current = r;
        }

    }

    void setOther(Pedestrian otherP) {
        other = otherP;
    }

    Object getDirection() {
        return current;
    }

    Object getOppositeDirection() {
        if (current.equals(l)) {
            return r;
        } else {
            return l;
        }
    }

    void switchDirection() throws InterruptedException {
        Thread.sleep(150);
        current = getOppositeDirection();
        System.out.println(Thread.currentThread().getName() + " is stepping aside.");
    }

    public void run() {
        while (getDirection().equals(other.getDirection())) {
            try {
                switchDirection();
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}




