package atv_16;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int media;
        for (int i = 1; i < 30; i++) {
            int efic = rand.nextInt(15000);
            System.out.println("no dia " + i + " a produçao total e de " + efic + "");
            soma += efic;
        }
        media = soma / 30;
        System.out.println("A media total é: " + media );
    }
}

