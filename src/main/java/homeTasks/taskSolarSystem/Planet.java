package homeTasks.taskSolarSystem;

public class Planet {

    String name;
    boolean atmosphere;
    float rotationPeriod;      // (1d=24h) around sun
    double speedPlanet;        // km/h speed
    int numSputnik;


    public Planet() {
        this.name = name;
        this.atmosphere = atmosphere;
        this.numSputnik = numSputnik;
        this.speedPlanet = speedPlanet;
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

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public int getNumSputnik() {
        return numSputnik;
    }

    public double getSpeedPlanet() {
        return speedPlanet;
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

