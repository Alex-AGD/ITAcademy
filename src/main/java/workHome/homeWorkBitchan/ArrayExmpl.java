package workHome.homeWorkBitchan;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExmpl {


int[] massiv;

    public void userInput() {

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите требуемое действие:\n");
        System.out.printf("1. Заполнение массива\n");
        System.out.printf("2. Вывод массива\n");
        System.out.printf("3. Сумма всех значений массива\n");
        System.out.printf("4. Среднее арифмитическое всех элементов\n");
        System.out.printf("5. Максимальное значение\n");
        System.out.printf("6. Минимальное значение\n");
        System.out.printf("7. Сортировка\n");
        System.out.printf("8. Удаление элемента массива\n");


        switch (in.nextInt()) {
            case 1:
                System.out.print("Выберите требуемое действие:\n");
                System.out.print("1. Заполнить с клавиатуры\n");
                System.out.print("2. Заполнть рандомно\n");
                if (in.nextInt() == 1)
                    System.out.print("Введите размер массива[1...50]\n");
                int size = in.nextInt();
                massiv = new int[size];
                System.out.println("Ведите значения :");
                for (int a = 0; a < size; a++) {
                    massiv[a] = in.nextInt();
                }
                System.out.print("Введённые вами значения :");
                for (int i = 0; i < size; i++) {
                    System.out.print(" " + massiv[i]);
                }
                System.out.println();
                userInput();

            case 2:
                System.out.print("2. Вывод массива\n");
                System.out.print(" " + Arrays.toString(massiv));

                break;
            case 3:
                System.out.printf("3. Сумма всех значений массива\n");
                break;
            case 4:
                System.out.printf("4. Среднее арифмитическое всех элементов\n");
                break;
            case 5:
                System.out.printf("5. Максимальное значение\n");
                break;
        }
        switch (in.nextInt()) {


        }
    }
}
