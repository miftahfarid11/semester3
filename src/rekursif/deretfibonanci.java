package rekursif;

import java.util.Scanner;
public class deretfibonanci {

    static int fibonacci (int n){
        if(n==0 || n==1){
            return n;
        } else {
            return (fibonacci(n - 1 ) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Deret Bilangan Fibonachi : ");
        int n = scan.nextInt();

        System.out.println( "Hasil Bilangan Fibonachi: ");
        for (i = 0; i < n; i++){
            System.out.print(fibonacci(j)+ " , ");
            j++;
        }
        System.out.println();
    }
}
