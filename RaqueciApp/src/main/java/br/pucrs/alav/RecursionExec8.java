package br.pucrs.alav;
import java.util.Scanner;
public class RecursionExec8 {
    public static  void main (String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("digite um valor para frase: ");
        String phrase = in.nextLine();

        String result = ehPalidrome(phrase) ? "é palindrome" : "não é palindrome";

        System.out.printf(result);
    }

    public static boolean ehPalidrome(String string){
        return ehPalindrome(string, 0);
    }

    private static boolean ehPalindrome(String string, int position){
        final boolean b = string.charAt(position) == string.charAt(string.length() -1 - position);
        if(position >= string.length()/2) return b;
        return b && ehPalindrome(string, position + 1);
    }
}
