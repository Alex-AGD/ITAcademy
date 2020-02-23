package main.java.workHome.multithreading.sample2;

public class ThreadRecourse extends Thread {

    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Resource.changeStaticI();
        new Resource().changeI();
    }
}
