package main.java.by.academy.java;

public class Equals {
    public static void main(String[] args) {

        Integer i = new Integer(1);
        Integer j = new Integer(1);

        System.out.println(i==j);


        Integer a = new Integer(1);
        Integer x = a;
        System.out.println(a==x);

//Integer z = new Integer(null);
Integer z =null;
z.equals(z);





    }
}
