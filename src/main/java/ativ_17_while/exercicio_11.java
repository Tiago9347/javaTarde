package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        double umidade;

        do {
            System.out.print("Informe a umidade (%): ");
            umidade = sc.nextDouble();

            if (umidade < 30 || umidade > 55) {
                System.out.println("Umidade fora do intervalo aceitável [30% - 55%]. Tente novamente.");
            }

        } while (umidade < 30 || umidade > 55);

        System.out.println("Umidade aceita: " + umidade + "%");
    }
}
