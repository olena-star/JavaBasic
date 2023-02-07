import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        //Lesson 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в евро");

        int euro = scanner.nextInt();
        double dollars = euro * 1.069;
        System.out.println("Ваша сумма в долларах " + Math.floor(dollars));
    }
}
