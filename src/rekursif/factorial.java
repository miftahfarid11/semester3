package rekursif;

import java.util.Scanner;
public class factorial {

    static int factorial (int n) {
        if (n==1) {
            return 1;
        }
        else
            return n * factorial( n - 1);
    }
    public static void main(String[] args) {
        int bil, hasil;

        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Bilangan : ");
        bil = scan.nextInt();
        hasil = factorial(bil);

        System.out.println(" Faktorial dari " + bil + "adalah : " + hasil);
    }
}
