package task25;

public class RunnerCard {

    public static void main(String[] args) {

        CardsBank people = new CardsBank("John", "Lenon", "male", 37, "MasterCard",
                192020, true);
        System.out.println(people);
        people.getCash();

    }
}