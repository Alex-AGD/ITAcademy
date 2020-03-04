package workHome.polymorphism;


public class MainRun {


    public static void main(String[] args) {
        SportsMan sportsMan1 = new SportsMan("Азиат", "Черный", "Белые",
                "Вася", "Пупкин", 18, "Тенис");
        sportsMan1.sayHello();

        System.out.println(sportsMan1);


        Jeneric<String, String, Double> jeneric1 = new Jeneric<>("Имя", "Фамилия", 4.5);
        //System.out.println(jeneric1);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}




