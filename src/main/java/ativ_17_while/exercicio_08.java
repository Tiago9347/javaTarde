package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int totalCaixas = 0;
        int viagens = 0;
        int caixasEntregues;

        System.out.println("=== Controle de entregas do AGV ===");
        System.out.println("Objetivo: Entregar pelo menos 50 caixas.");

        do {
            System.out.print("Caixas entregues na viagem " + (viagens + 1) + ": ");
            caixasEntregues = sc.nextInt();

            if (caixasEntregues > 0) {
                totalCaixas += caixasEntregues;
                viagens++;
            } else {
                System.out.println("Valor inválido. Informe uma quantidade positiva.");
            }

        } while (totalCaixas < 50);

        System.out.println("Total de caixas entregues: " + totalCaixas);
        System.out.println("Número de viagens realizadas: " + viagens);
    }
}
