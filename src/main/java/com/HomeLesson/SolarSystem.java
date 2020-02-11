package main.java.com.HomeLesson;

public class SolarSystem {

    public static void main(String[] args) {

        {
            Planet planet = new Planet();
            planet.setName("Earth");
            boolean atmosphere = planet.getAtmosphere();
            int planetNumSputnik = planet.getNumSputnik();
            double speedPlanet = planet.getSpeedPlanet();
            float rotationPeriod = planet.getRotationPeriod();

            System.out.println(planet.getName());
            System.out.println("Atmosphere - " + " " + atmosphere);
            System.out.println("NumSputnik - " + planetNumSputnik);
            System.out.println("speedPlanet - " + speedPlanet);
            System.out.println("RotationPeriod - " + rotationPeriod);

            System.out.println("Distance 1/day (around sun) = " + speedPlanet * rotationPeriod + "km");

            planet.itSputnik();


            //method -- is planet||sputnik
            if (planet.getAtmosphere() && planet.getNumSputnik() > 0) {
                System.out.println(planet.getName() + " " + "= planet");
            } else {
                System.out.println(planet.getName() + " " + "= sputnik");
            }
            System.out.println();

            Planet planetTwo = new Planet();

            planetTwo.setName("Mars");
            planetTwo.setAtmosphere(false);
            System.out.println(planetTwo.getName());
            System.out.println(("Atmosphere = ") + planetTwo.getAtmosphere());
            System.out.println(("NumSputnik = ") + planetTwo.getNumSputnik());
            System.out.println(("SpeedPlanet = ") + planetTwo.getSpeedPlanet());
            System.out.println(("RotationPeriod = ") + planetTwo.getRotationPeriod());


            planetTwo.itSputnik();

            System.out.println(("Distance 1/day (around sun) = ") +
                    planetTwo.getSpeedPlanet() * planetTwo.getRotationPeriod() + "km");

            planetTwo.itSputnik();
            //method -- is planet||sputnik
            if (planetTwo.getAtmosphere() && planetTwo.getNumSputnik() > 0) {
                System.out.println(planetTwo.getName() + " " + "= planet");
            } else {
                System.out.println(planetTwo.getName() + " " + "= sputnik");

                planetTwo.itSputnik();
            }
        }


        System.out.println();


        Sputnik sputnik = new Sputnik("Moon", false, 0,
                18043530, 43);
        String SputnikName = sputnik.getName();
        boolean atmosphere = sputnik.getAtmosphere();
        int sputnikNumSputnik = sputnik.getNumSputnik();
        double speedSputnik = sputnik.getSpeedSputnik();
        float rotationPeriod = sputnik.getRotationPeriod();


        System.out.println(SputnikName);
        System.out.println("Atmosphere - " + " " + atmosphere);
        System.out.println("NumSputnik - " + sputnikNumSputnik);
        System.out.println("speedPlanet - " + speedSputnik);
        System.out.println("RotationPeriod - " + rotationPeriod);

        System.out.println("Distance 1/day (around sun) = " + speedSputnik * rotationPeriod + "km");

        sputnik.itSputnik();

        //method -- is planet||sputnik
        if (sputnik.getAtmosphere() && sputnik.getNumSputnik() > 0) {
            System.out.println(sputnik.getName() + " " + "= planet");
        } else {
            System.out.println(sputnik.getName() + " " + "= sputnik");
        }
        System.out.println();


        Sputnik sputnikTwo = new Sputnik("", false, 0,
                56435673, 74);

        sputnikTwo.setName("Fobos");
        sputnikTwo.getAtmosphere();
        System.out.println(sputnikTwo.getName());
        System.out.println(("Atmosphere = ") + sputnikTwo.getAtmosphere());
        System.out.println(("NumSputnik = ") + sputnikTwo.getNumSputnik());
        System.out.println(("SpeedPlanet = ") + sputnikTwo.getSpeedSputnik());
        System.out.println(("RotationPeriod = ") + sputnikTwo.getRotationPeriod());

        System.out.println(("Distance 1/day (around sun) = ") +
                sputnikTwo.getSpeedSputnik() * sputnikTwo.getRotationPeriod() + "km");

        sputnikTwo.itSputnik();
        //method -- is planet||sputnik
        if (sputnikTwo.getAtmosphere() && sputnikTwo.getNumSputnik() > 0) {
            System.out.println(sputnikTwo.getName() + " " + "= planet");
        } else {
            System.out.println(sputnikTwo.getName() + " " + "= sputnik");
        }
    }
}







