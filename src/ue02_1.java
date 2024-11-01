import java.util.Scanner;
public class ue02_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Gib deine erste Zahl ein: ");
        int number1 = scanner.nextInt();

        System.out.println("Gib deine zweite Zahl ein: ");
        int number2 = scanner.nextInt();

        System.out.println("Gib deine dritte Zahl ein: ");
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " ist die größte Zahl.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " ist die größte Zahl.");
        } else {
            System.out.println(number3 + " ist die größte Zahl.");
        }

    }
}
