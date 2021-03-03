package br.pucrs.alav;

import java.util.Scanner;

public class RecursionExec1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Entre com o multiplicando: ");
            int x = scanner.nextInt();

            System.out.print("Entre com o multiplicador: ");
            int y = scanner.nextInt();



            int result = x >= 0 ? multiplica(x, y) : multiplica(y, x);

            System.out.println("resultado da multiplicação: " + x + " * " + y + " = " + result);
        }
    }

    private static int multiplica(int x, int y) {
        int result = multiplicaRecursivo(Math.abs(x), Math.abs(y));
        if ((x < 0 || y < 0) && !(x < 0 && y < 0)) return -result;
        return result;
    }

    private static int multiplicaRecursivo(int x, int y) {
        if (x == 0 || y == 0) return 0;
        if (x == 1) return y;
        return y + multiplicaRecursivo(x - 1, y);
    }
}
