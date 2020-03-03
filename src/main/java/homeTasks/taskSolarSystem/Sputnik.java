package homeTasks.taskSolarSystem;

public class Sputnik {

    String name;
    boolean atmosphere;
    float rotationPeriod;      // (1d=24h) around sun
    double speedSputnik;        // km/h speed
    int numSputnik;


    public Sputnik(String name, boolean atmosphere, int numSputnik, double speedSputnik,
                   float rotationPeriod) {
        this.name = name;
        this.atmosphere = atmosphere;
        this.numSputnik = numSputnik;
        this.speedSputnik = speedSputnik;
        this.rotationPeriod = rotationPeriod;  //h

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getAtmosphere() {
        return atmosphere;
    }

    public int getNumSputnik() {
        return numSputnik;
    }

    public double getSpeedSputnik() {
        return speedSputnik;
    }

    public float getRotationPeriod() {
        return rotationPeriod;
    }

    public void itSputnik() {
        if (atmosphere && numSputnik > 0) {
            this.name = name;
            System.out.println("This planet " + name);
        } else {
            System.out.println("This sputnik " + name);
        }
    }
}