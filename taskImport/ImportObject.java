package taskImport;

import com.HomeLesson.Operations;
import com.HomeLesson.Planet;
import com.HomeLesson.SolarSystem;
import com.ITAcad.Main;

public class ImportObject {



    public ImportObject() {
    }

    public static void main(String[] args) {
        Operations printEven = new Operations();
        printEven.printEven(6);
        System.out.println();

        Main test = new Main();
        test.test(9);

        System.out.print("\n");  // перевод на новую строку

        Planet planetThree = new Planet("",true,6,6,5);
        planetThree.setName("Avrora");
        System.out.println(planetThree.getName());
        System.out.println(planetThree.getAtmosphere());


//jhkhjl


    }


    }








