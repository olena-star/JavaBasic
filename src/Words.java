import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        //Lesson2
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if(first.length() %2==0 && second.length() %2==0){
            System.out.println(first.substring(0, first.length() / 2) + second.substring(second.length() / 2));
        }
        else System.out.println("Ви ввели слово с нечетним количеством букв");
    }
}
