package Task24;

public class AppDescription extends StateSocket {
    private String name;
    private String type;
//

    @Override
    public String toString() {
        return "Домашний прибор " +
                "name ='" + name + '\'' +
                ", type ='" + type + '\'' +
                ", state = " + state +
                '}';
    }

    public AppDescription(String name, String type, boolean state) {
        super(state);
        this.name = name;
        this.type = type;

        if (state) {
            System.out.println("Включен в розетку");
        } else {
            System.out.println("Выключен из розетки");
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
}

