package main.java.com.HomeLesson;

public class Operations {

    //Task  1
     public void printEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Number " + x + " even");
        } else {
            System.out.println("Number " + x + " not even");
        }
    }

    //Task 2
    void numNearTen(float m, float n) {
        float res1 = 10 - m;
        float res2 = n - 10;
        System.out.println("m = " + res1 + " " + "n = " + res2);
        if (res1 > res2) {
            System.out.println(n + " > 10");
        } else {
            System.out.println(m + " > 10");
        }
    }


    //Task 3
    void printMoreZero(int num) {
        if (num > 0) {
            System.out.println("number > 0");
        }
        if (num < 0) {
            System.out.println("number < 0");
        }
        if (num == 0) {
            System.out.println("number = 0");
        }
    }


    //Task 4
    void printVarZero(int q, int w) {
        if (q > 0 && w > 0) {
            System.out.println(q + " > 0");
            System.out.println(w + " > 0");
        }
    }

    //Task 5
    void printMon(int m) {
        int Month = m;      //int value
        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("invalid number");
                break;

        }
    }
}








