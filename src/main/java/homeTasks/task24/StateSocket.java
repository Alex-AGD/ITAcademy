package main.java.homeTasks.task24;

public class StateSocket implements PowerSocket {
    boolean state = false;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public StateSocket(boolean state) {
        this.state = state;
    }

    @Override
    public void on() {
        state = true;
    }

    @Override
    public void off() {
        state = false;
    }

    @Override
    public void printState() {

    }
}