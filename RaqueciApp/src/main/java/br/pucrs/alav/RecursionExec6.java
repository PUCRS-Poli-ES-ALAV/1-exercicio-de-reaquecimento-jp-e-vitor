package br.pucrs.alav;
import java.util.Scanner;
public class RecursionExec6 {

    public static  void main (String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("digite um valor para M: ");
        float m_value = in.nextInt();

        System.out.println("digite um valor para N: ");
        float n_value = in.nextInt();

        float result = Ackerman(m_value,n_value);

        System.out.printf("O resultado de Ackerman(%.0f,%.0f) = %.0f",m_value,n_value,result);
    }

    public static float Ackerman(float m, float n){
        if(m == 0) return n + 1;
        if(m != 0 && n == 0) return Ackerman(m - 1, 1);
        return Ackerman(m - 1, Ackerman(m,n - 1));
    }

}
