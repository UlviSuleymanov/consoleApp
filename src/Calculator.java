import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zehmet olmasa operasiyani seciniz : 1 + , 2 - , 3 * , 4 /");
        int operation = scanner.nextInt();
        System.out.println("Zehmet olmasa A ya deyer verin");
        double a = scanner.nextDouble();
        System.out.println("Zehmet olmasa B ya deyer verin");
        double b = scanner.nextDouble();
        double result = 0;
        if (operation == 1) {
            result = a + b;
            if (a < 5) {
                System.out.println("A 5den kicikdir");
            } else if (a <= 6) {
                System.out.println("A 6 ve ya 6dan kicik bir ededdir");
            } else if (b > 8) {
                System.out.println("B 8den boyukdur");
            } else if (b >= 7) {
                System.out.println("B ya 7dir ya da 7den boyukdur");
            } else if (!(a == b)) {
                System.out.println("A Bye beraber deyil");
            }
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            result = a / b;
        } else {
            System.out.println("Operasiya zamani ne ise sehf oldu. xais edirik yeniden baslayiniz.");
        }
        System.out.println("Result :" + result);

    }
}
