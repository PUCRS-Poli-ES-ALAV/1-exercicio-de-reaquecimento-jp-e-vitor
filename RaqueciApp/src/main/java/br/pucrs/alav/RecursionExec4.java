package br.pucrs.alav;

import java.util.Scanner;

public class RecursionExec4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre a string: ");

        String texto =  scanner.nextLine();
        
        String result = reverte(texto);
        System.out.println("invertido: " + result);
    }

    private static String reverte(String texto) {
        int tamanho = texto.length();
        StringBuffer buffer = reverteString(new StringBuffer(""), texto, tamanho);
        return buffer.toString();
    }

    private static StringBuffer reverteString(StringBuffer buffer, String texto, int posicao) {
        if (posicao == 0) return buffer;
        buffer.append(texto.charAt(posicao - 1));
        return reverteString(buffer, texto, posicao - 1);
    }
}
