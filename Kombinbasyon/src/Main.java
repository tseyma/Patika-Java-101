import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = scan.nextInt();
        System.out.print("Bir sayı daha giriniz ");
        int r = scan.nextInt();
        double total = 1;

        // n! hesabı
        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        double total2 = 1;

        // r! hesabı
        for (int j = 1; j <= r; j++) {
            total2 *= j;
        }

        double total3 = 1;

        // (n-r)! hesabı
        int k = n - r;
        for (int l = 1; l <= k; l++) {
            total3 *= l;
        }

        double C = total / (total2 * total3);

        System.out.println("C(" + n + "," + r + ") = " + C);
    }
}