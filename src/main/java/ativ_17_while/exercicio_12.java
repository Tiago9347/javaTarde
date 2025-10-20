package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int numeroPalete;
        int contagem = 0;

        System.out.println("Digite o número do palete. Digite -1 para encerrar.");

        do {
            System.out.print("Número do palete: ");
            numeroPalete = sc.nextInt();

            if (numeroPalete != -1) {
                contagem++;
            }

        } while (numeroPalete != -1);

        System.out.println("Contagem final de paletes: " + contagem);
    }
}
