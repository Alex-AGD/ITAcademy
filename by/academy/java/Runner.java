package by.academy.java;

public class Runner {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "abc";

        String str3 = new String(("abc"));


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
                                                //str3 = str3.intern();

        System.out.println(str1.equals(str3));
        System.out.println(str2.compareTo(str1));



    }
}
