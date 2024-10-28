import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int radius = 4;


        System.out.print("Gib die X-Koordinate ein: ");
        double x = scanner.nextDouble();

        System.out.print("Gib die Y-Koordinate ein: ");
        double y = scanner.nextDouble();

        double hypotenuse = Math.sqrt(y*y + x*x);

        if (x >= 0 && y >= 0 && x <= radius && y <= radius && hypotenuse >= radius) {
            System.out.println("Der Punkt liegt innerhalb der grünen Fläche :)");
        } else {
            System.out.println("Der Punkt liegt außerhalb der grünen Fläche :(");
        }
    }
}
