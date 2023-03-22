import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //tek setir ucun komment.
//        /*
//        * cox setirli komment*/
//        int x = 8;// tam ededleri int tipi ile ifade edirik. soldan saga qaydasi type safety verir.
//        int y = 6; // Riyazi operasiya Arithmatic operations + - * / %
//        int c = x+y;
//        int b = y-x;
//        int d = x*y;
//        double l = x/(double)y;// burada tam hissesi 0 kesir hissesi ise atilir.
//        //double kesir ededlerinide ozunde saxlayan butun ededlere double deyilir.
//        // casting int i double cast etdik cast emek bir seyi basqa seye cevirmek demekdir.
//        int t = x/y; //bu tam edidi qaytarir kesir ededi delete olunur.
//        double r = x % y ; // bu bize kesir ededini qaytarir.
//         = asign olunma operatoru.
//        int x = 5; // int xsin tipidir x ozu variabledir 5 ise onun valuesudur.
//        char character = '$';// bir simvolu ifade edir.
//        System.out.println(character);
//        boolean isTrue = true; // boolean yalniz iki data saxliyir ya true ya false.
//        String name = "Ulvi"; // ozunde char[] massivi saxlayan bir object.
//        long x = 5; // long ile int arasindaki ferq onlarin size dir yeni memory slotda tutqu yerdir. long boyuk int kicik
//        int y = (int) x; // manual castinge explicit casting deyilir. bu ona goredirki data itkisi sadece programistin uzerine dususun.
//        int z = 7;
//        long t = z;
//        double d = 5.5; long inting boyuk olanidir =. onun ucun yaddasda boyuk yer ayrilir.
//        float d1 = 5.5f; double floating boyuk olanidir onun ucun yaddasda boyuk yer ayrili.
//        float f = (float) d;
//        int x = 5;
//        x += 4;
//        x *= 2; riyazi emeliyyatlarin qisa formalari.
//        x -= 1;
        Scanner scanner = new Scanner(System.in); // scannerin isi inputu data sekilinde goturmek.

        System.out.println("Please select an operation 1 for + 2 for - 3 for * 4 for /");
        int menuSelection = scanner.nextInt(); // burada scanner int tipli bir user inputu gozleyir.
        System.out.println("Please enter Value for A");
        double a = scanner.nextDouble();
        System.out.println("Please enter value for B");
        double b = scanner.nextDouble();

        if (menuSelection == 1) {
            System.out.println(a + b);
        }
        if (menuSelection == 2) {
            System.out.println(a - b);
        }
        if (menuSelection == 3) {
            System.out.println(a * b);
        }
        if (menuSelection == 4) {
            System.out.println(a / b);
        }

    }
}