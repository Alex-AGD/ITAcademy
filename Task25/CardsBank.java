package Task25;

import java.util.Scanner;

public class CardsBank extends Clients implements GetMoney {
    private String nameCard;
    private int validTHRU;
    private boolean statusCard;


    public CardsBank(String name, String lastName, String sex,
                     int age, String nameCard, int validTHRU, boolean statusCard) {
        super(name, lastName, sex, age);
        this.nameCard = nameCard;
        this.validTHRU = validTHRU;
        this.statusCard = statusCard;
    }


    @Override
    public void GetCash() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кодовое слово или фразу: ");
        String phrase1 = sc.nextLine();
        if (statusCard = true) {
            System.out.println("Спасибо карта активирвоана");
        } else {
            System.out.println("Попробуй ещё раз");
        }


    }
}

//