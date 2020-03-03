package workHome.lessonsYouTube;

public class ОтслеживаниеИсключений {

    public static void main(String[] args) {
        float[] arr = new float[] {5.7f, 8.1f, 0.002f};

        try {  // в try пишем что хотим проверить
            System.out.println(arr[2]);  //
            int res = 100 / 1;
        } catch (ArithmeticException e) {   // пишем какую ошибку
            System.out.println("Ошибка: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e);
        } finally {
            System.out.print("Сработал блок finally");
        }
    }

}
