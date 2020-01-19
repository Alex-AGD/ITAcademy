package Encapsulation;

import java.util.Scanner;

public class RunnerAtm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm atm = new Atm(0, 0, 0);
        System.out.println(atm.toString());
        System.out.println("Do  you want add money to an ATM? (y/n) ?");
        switch (in.nextLine()) {
            case "y":
                System.out.println("Enter the amount of money with a value of 20 to the ATM: ");
                atm.addMoney(Atm.MONEY20, in.nextInt());
                System.out.println("Enter the amount of money with a value of 50 to the ATM: ");
                atm.addMoney(Atm.MONEY50, in.nextInt());
                System.out.println("Enter the amount of money with a value of 100 to the ATM: ");
                atm.addMoney(Atm.MONEY100, in.nextInt());
                System.out.println("Money added! Thank you.");
                System.out.println(atm.toString());
                System.out.println("Please enter amount you want to receive: ");
                System.out.println(atm.getMoney(in.nextInt()));
                System.out.println(atm.toString());

                break;
            case "n":
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Incorrect input please choose (y/n)");
                if ("y".equals(in.nextLine().toLowerCase())) {
                    System.out.println("Enter the amount of money with a value of 20 to the ATM: ");
                    atm.addMoney(Atm.MONEY20, in.nextInt());
                    System.out.println("Enter the amount of money with a value of 50 to the ATM: ");
                    atm.addMoney(Atm.MONEY50, in.nextInt());
                    System.out.println("Enter the amount of money with a value of 100 to the ATM: ");
                    atm.addMoney(Atm.MONEY100, in.nextInt());
                    System.out.println("Money added! Thank you.");
                    System.out.println(atm.toString());
                    System.out.println("Please enter amount you want to receive: ");
                    System.out.println(atm.getMoney(in.nextInt()));
                    System.out.println(atm.toString());
                }


        }
    }}
