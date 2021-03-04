package br.pucrs.alav;
import java.util.Scanner;
public class RecursionExec5 {

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("digite um valor para N: ");
        int value = in.nextInt();

        float result = generator(value);

        System.out.printf("O resultado de f(%d) = %.2f",value,result);
    }

    public static float generator(int n){
        if(n == 1 || n == 2) return n;
        return 2 * generator(n - 1) + 3 * generator(n - 2);
    }
}
