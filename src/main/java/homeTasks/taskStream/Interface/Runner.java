package main.java.homeTasks.taskStream.Interface;

public class Runner {
    public static void main(String[] args) {
       MyFyncInt<String> fist = (val1, val2, val3) -> val1+val2.replace(val3,val1)+val3.toLowerCase();
        System.out.println(fist.getResult("Hello ","Func"," Interface"));

        MyFyncInt<Integer> two =(val1, val2, val3) -> val1*val2/val3;
        System.out.println(two.getResult(5,6,2));

            }
    }

