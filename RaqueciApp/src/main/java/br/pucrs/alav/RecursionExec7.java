package br.pucrs.alav;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Scanner;
public class RecursionExec7 {
    public static  void main (String args[]){
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        int opcao = 0;
        while(true){
            System.out.println("preencha o vetor com numeros inteiros, use -1 para finalizar o programa");
            opcao = in.nextInt();
            if(opcao == -1) break;
            lista.add(opcao);
        }
        somaProduto(lista);
    }

    public static void somaProduto(ArrayList<Integer> lista){
        System.out.println("Valor da soma de todos os itens da lista = " + soma(lista, 0));
        System.out.println("Valor do produto de todos os itens da lista = " + produto(lista, 0));
    }

    private static int soma(ArrayList<Integer> lista, int index){
        if(index == lista.size() - 1){
            return lista.get(index);
        }
        return lista.get(index) + soma(lista, index + 1);
    }

    private static int produto(ArrayList<Integer> lista, int index){
        if(index == lista.size() - 1){
            return lista.get(index);
        }
        return lista.get(index) * produto(lista, index + 1);
    }
}
