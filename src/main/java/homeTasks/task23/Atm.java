package homeTasks.task23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atm extends Thread {
    private int money20;
    private int money50;
    private int money100;

     final static String MONEY20 = "money20";
     final static String MONEY50 = "money50";
    final static String MONEY100 = "money100";


    public Atm(int money20, int money50, int money100) {
        this.money20 = money20;
        this.money50 = money50;
        this.money100 = money100;
    }

    public Atm() {

    }


    public int getMoney20() {
        return money20;
    }

    public void setMoney20(int money20) {
        this.money20 = money20;
    }

    public int getMoney50() {
        return money50;
    }

    public void setMoney50(int money50) {
        this.money50 = money50;
    }

    public int getMoney100() {
        return money100;
    }

    public void setMoney100(int money100) {
        this.money100 = money100;
    }

    public void addMoney(String type, int money) {
        switch (type) {
            case (MONEY20):
                money20 = getMoney20() + money;
                break;
            case (MONEY50):
                money50 = getMoney50() + money;
                break;
            case (MONEY100):
                money100 = getMoney100() + money;
                break;
        }
    }

    public String toString() {
        return "ATM have:\n " +
                "\t Banknot's 20$ = " + money20 +
                ", Banknot's 50$ = " + money50 +
                ", Banknot's 100$ = " + money100;
    }

    public boolean getMoney(int sum) {
        int getSum = getMoney20() * 20 + getMoney50() * 50 + getMoney100() * 100;
        if (getSum < sum) {
            System.out.println("Not enough money at the ATM");
            return false;
        } else {
            if (sum % 10 != 0) {
                System.out.println("Choose a different amount, " +
                        "at the ATM only banknotes in denominations of 20, 50, 100");
                return false;
            } else {
                int monHundred = sum / 100;
                money100 -= monHundred;
                int monFifty = (sum - monHundred * 100) / 50;
                money50 -= monFifty;
                int monTwen = (sum - monHundred * 100 - monFifty * 50) / 20;
                money20 -= monTwen;
                System.out.println("Recive 100$:" + monHundred + "шт" + "  Recive 50$:" +
                        monFifty + "шт" + "  Recive 20$:" + monTwen + "шт");
            }
            return true;
        }

    }
public void rett() throws InterruptedException {
        try {
            Thread thread = new Thread();
            thread.start();

    Scanner in = new Scanner(System.in);
    System.out.println("Do  you want add money to an ATM? (y/n) ?");
    switch (in.nextLine()) {
        case "y":
            System.out.println("Enter the amount of money with a value of 20 to the ATM: ");
            addMoney(MONEY20, in.nextInt());
            System.out.println("Enter the amount of money with a value of 50 to the ATM: ");
            addMoney(MONEY50, in.nextInt());
            System.out.println("Enter the amount of money with a value of 100 to the ATM: ");
            addMoney(MONEY100, in.nextInt());
            System.out.println("Money added! Thank you.");
            System.out.println(toString());
            System.out.println("Please enter amount you want to receive: ");
            System.out.println(getMoney(in.nextInt()));
            System.out.println(toString());

            break;
        case "n":
            System.out.println("Good bye!");
            break;
        default:
            System.out.println("Incorrect input please choose (y/n)");
            rett();
    }

}
        catch (InputMismatchException pidor){
    System.out.println("Вы ввели некорректные данные");
    Thread.sleep(1000);
            rett();

    }

    }}
