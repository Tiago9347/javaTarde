package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        System.out.print("Informe a quantidade total de prateleiras: ");
        int totalPrateleiras = sc.nextInt();
        sc.nextLine();

        int prateleirasValidadas = 0;

        while (prateleirasValidadas < totalPrateleiras) {
            System.out.print("Digite a etiqueta da prateleira validada: ");
            String etiqueta = sc.nextLine();

            prateleirasValidadas++;
            System.out.println("Prateleiras validadas: " + prateleirasValidadas + "/" + totalPrateleiras);
        }

        System.out.println("Inventário concluído.");
    }
}
