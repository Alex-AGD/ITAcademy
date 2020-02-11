package main.java.workHome.polimorf_incasul_classroom;

public class Test {
    public static void main(String[] args) {


        Simpson homer = new Simpson(1, "Homer");
        Simpson bart = new Simpson(2, "Homer");

        boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();


        if (isHashcodeEquals) {
            System.out.println("След срав методом equalds");
        } else {
            System.out.println("Не следует срвнивать методом equals т.к "
                    + "индефикатор отличается, что означает, что обьект точно не равны.");
        }
    }

}
