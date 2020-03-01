package homeTasks.taskMultithreading.livelock;

public class LiveLock {
    public static void main(String[] args) {
        Object left = new Object();
        Object right = new Object();
        Pedestrian one = new Pedestrian(left, right, 1); //one's left is one's left
        Pedestrian two = new Pedestrian(right, left, 0); //one's left is two's right, so have to swap order
        one.setOther(two);
        two.setOther(one);
        one.start();
        two.start();
    }
}
