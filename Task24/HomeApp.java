package Task24;

public class HomeApp {
    public static void main(String[] args) {
        AppDescription Coffee_maker = new AppDescription("Coffi maker", "220м", true);
        System.out.println(Coffee_maker);
        Coffee_maker.printState();

        System.out.println();


        AppDescription Vacuum_Cleaner = new AppDescription("Vacuum_Cleaner", "220м", false);
        Vacuum_Cleaner.printState();
        System.out.println(Vacuum_Cleaner);

        System.out.println();

        AppDescription Robot_Cleaner = new AppDescription("Robot_Cleaner", "220м", false);
        Robot_Cleaner.printState();
        System.out.println(Robot_Cleaner);

    }
}

//

