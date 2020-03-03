package homeTasks.taskOperations;

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
    void numNearTen() {
        float res1 = 10 - (float) 8.5;
        float res2 = (float) 11.45 - 10;
        System.out.println("m = " + res1 + " " + "n = " + res2);
        if (res1 > res2) {
            System.out.println((float) 11.45 + " > 10");
        } else {
            System.out.println((float) 8.5 + " > 10");
        }
    }


    //Task 3
    void printMoreZero(int x) {
        if (x > 0) {
            System.out.println("number: " + x + " > 0");
        }
        if (x < 0) {
            System.out.println("number: " + x + " < 0");
        }
        if (x == 0) {
            System.out.println("number: " + x + " = 0");
        }
    }


    //Task 4
    void printVarZero() {
        if (3 > 0 && 5 > 0) {
            System.out.println(3 + " > 0");
            System.out.println(5 + " > 0");
        }
    }

    //Task 5
    void printMon() {
        switch (13) {
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








