import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sayı, countsayı = 0;

        do {
            System.out.print("SAYI GİRİNİZ=");
            sayı = in.nextInt();
            while (sayı != 0) {
                countsayı += sayı % 10;
                sayı /= 10;
            }
        } while (sayı != 0);
        System.out.println("Toplam = " + countsayı);
    }
}
