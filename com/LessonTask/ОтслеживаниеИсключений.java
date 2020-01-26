package com.LessonTask;

public class ОтслеживаниеИсключений {

    public static void main(String[] args) {
        float[] arr = new float[] {5.7f, 8.1f, 0.002f};

        try {
            System.out.println(arr[2]);
            int res = 100 / 1;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            System.out.print("Сработал блок finally");
        }
    }

}
