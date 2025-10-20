package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double soma=0;
        int contador=0;

        do {
            System.out.println("informe o peso do lote");
            double peso=sc.nextDouble();
            soma+=peso;
            contador++;
            System.out.println("peso total ate agora: "+soma+"g");
        }while (soma<=500);
        System.out.println("limite de 500g ultrapassado ");
        System.out.println("total de peças inseridas: "+contador);
        System.out.println("peso total: "+soma+"g");
        sc.close();
    }
}
