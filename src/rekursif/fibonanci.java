package rekursif;

import java.util.Scanner;
public class fibonanci {

    static int fibonacci (int n){
        if(n==0 || n==1){
            return n;
        } else {
            return (fibonacci(n - 1 ) + fibonacci(n - 2));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bilangan Fibonacci dari : ");

        int n = scan.nextInt();
        for (int i = 0; i <= n; i++)
            System.out.println("adalah " + fibonacci(i));
    }
}
