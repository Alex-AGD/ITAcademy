package main.java.task24;

public class HomeApp {

    public static void main(String[] args) {

        AppDescription coffi_maker = new AppDescription("Coffi maker", "220м", true);
        System.out.println(coffi_maker);
        coffi_maker.printState();

        System.out.println();

        AppDescription vacuum_cleaner = new AppDescription("Vacuum_Cleaner", "220м", false);
        vacuum_cleaner.printState();
        System.out.println(vacuum_cleaner);

        System.out.println();

        AppDescription Robot_Cleaner = new AppDescription("Robot_Cleaner", "220м", false);
        Robot_Cleaner.printState();
        System.out.println(Robot_Cleaner);
    }
}