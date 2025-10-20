package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        int consecutivasAbaixo = 0;
        int totalLeituras = 0;
        double leitura;

        do {
            System.out.print("Informe o nível RMS de vibração: ");
            leitura = sc.nextDouble();
            totalLeituras++;

            if (leitura < 2.5) {
                consecutivasAbaixo++;
            } else {
                consecutivasAbaixo = 0; // zera contador se leitura >= 2.5
            }

        } while (consecutivasAbaixo < 3);

        System.out.println("\nTotal de leituras feitas: " + totalLeituras);

    }
}
