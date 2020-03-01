package homeTasks.taskIO.slidesExmp;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RunnerSlides {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }

        String dataPath = "D:\\project\\ItAcademy\\src\\main\\resources\\scanTxt.txt";
        try (Scanner s = new Scanner(new BufferedReader(new FileReader(dataPath)))) {
            //c= new Scanner(new File(dataPath));
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }
        }

        String input = "1 fish 2 fish red fish blue fish";
        Scanner k = new Scanner(input).useDelimiter("\\s*fish\\s");
        System.out.println(k.nextInt());
        System.out.println(k.nextInt());
        System.out.println(k.next());
        System.out.println(k.next());

        Console o = System.console();
        if (o == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        String str = o.readLine();
        char[] pass = o.readPassword();
    }
}


