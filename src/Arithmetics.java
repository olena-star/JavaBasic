import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        //Lesson 3
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println(Sum(firstNumber, secondNumber));
        System.out.println(Subtraction(firstNumber, secondNumber));
        System.out.println(Multiplication(firstNumber, secondNumber));
        System.out.println(Division(firstNumber, secondNumber));
    }

    public static int Sum (int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int Subtraction (int firstNumber, int secondNumber){
      int result = firstNumber - secondNumber;
      return result;
    }

    public static int Multiplication (int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int Division (int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        return result;
    }
}
