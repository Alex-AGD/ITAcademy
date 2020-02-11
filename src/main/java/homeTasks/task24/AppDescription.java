package main.java.homeTasks.task24;

public class AppDescription extends StateSocket {
    private String name;
    private String type;

    public AppDescription(String name, String type, boolean state) {
        super(state);
        this.name = name;
        this.type = type;

        if (state) {
            System.out.println("On");
        } else {
            System.out.println("Off");
        }
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printState() {
        super.printState();
    }

    @Override
    public String toString() {
        return "Home appliance: " +
                "name ='" + name + '\'' +
                ", type ='" + type + '\'' +
                ", state = " + state +
                '}';
    }
}

