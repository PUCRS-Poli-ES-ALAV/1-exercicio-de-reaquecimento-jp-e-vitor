package br.pucrs.alav;
import java.util.Scanner;
public class RecursionExec10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor para N: ");
        int value = in.nextInt();

        float result = fibonacci(value);

        System.out.printf("O resultado de Fibonnaci(%d) = %.0f",value,result);
    }

    public static int fibonacci(int n) {
        if(n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
