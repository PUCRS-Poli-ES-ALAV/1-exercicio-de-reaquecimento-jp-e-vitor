package br.pucrs.alav;

import java.util.Scanner;

public class RecursionExec2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com o primeiro valor: ");
            int x = scanner.nextInt();

            System.out.print("Entre com o segundo valor: ");
            int y = scanner.nextInt();

            int result = soma(x,y);

            System.out.println("resultado da multiplicação: " + x + " + " + y + " = " + result);
        }
    }

    private static int soma(int x, int y) {
        if (x == 0 && y == 0) return 0;
        if (x == 0) return 1 + soma(0, y - 1);
        return 1 + soma(x - 1, y);
    }
}
