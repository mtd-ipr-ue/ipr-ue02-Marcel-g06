import java.util.Scanner;
public class ue02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 0;

        System.out.print("Gib die Jahreszahl ein: ");
        int year = scanner.nextInt();

        System.out.print("Gib die Monatszahl an: ");
        int month = scanner.nextInt();

        switch(month) {
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 2:
                if((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
            System.out.println("Diese Zahl trift auf keinen Monat zu");
        }

        System.out.println("Die Monatszahl " + month + " hat " + days + " Tage.");
    
    }
}
