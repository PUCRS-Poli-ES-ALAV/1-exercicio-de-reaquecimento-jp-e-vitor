package br.pucrs.alav;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RecursionExec9 {
    private static String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","t","u","v","W",
            "X","Y","Z"};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("insira um valor entre 1 a 26 equivalentes a letra do alfabeto");
        int value = in.nextInt();


        Set<String> alphabet = new HashSet<String>(Arrays.asList(letters));

        System.out.println("Todas as combinações possiveis: \n" + combinations(alphabet,value));
    }

    public static String[] charactersSelect(int n){
        String[] alphabet = new String[n];
        for(int i = 0; i < n; i++){
            alphabet[i] = letters[i];
        }
        return alphabet;
    }

    public static Set<Set<String>> combinations(Set<String> alphabet, int n){
        if (alphabet.size() == 0) {
            throw new IllegalArgumentException("alphabet.size must be > 0");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) {
            Set<Set<String>> result = new HashSet<Set<String>>();
            result.add(new HashSet<String>());
            return result;
        } else {
            Set<Set<String>> result = new HashSet<Set<String>>();
            for (String e : alphabet) {
                Set<String> newAlphabet = new HashSet<String>(alphabet);
                newAlphabet.remove(e);
                Set<Set<String>> smallerCombinations = combinations(newAlphabet, n - 1);
                for (Set<String> smallerCombination : smallerCombinations) {
                    Set<String> combination = new HashSet<String>(smallerCombination);
                    combination.add(e);
                    result.add(combination);
                }
            }

            return result;
        }

    }
}
