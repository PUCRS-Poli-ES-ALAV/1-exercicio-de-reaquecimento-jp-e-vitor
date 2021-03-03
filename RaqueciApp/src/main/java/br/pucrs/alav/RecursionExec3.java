package br.pucrs.alav;

import java.util.Scanner;

public class RecursionExec3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Entre o valor de N: ");
            int n = scanner.nextInt();

            double result = calcula(n);

            System.out.println("resultado: " + result);
        }
    }

    private static double calcula(int n) {
        if (n == 0) throw new RuntimeException("JAMAIS DIVIRAS POR ZERO, JA DIRIA O MANDAMENDO 0");
        if (n == 1) return 1;
        return 1.0 / n + calcula(n - 1);
    }
}
