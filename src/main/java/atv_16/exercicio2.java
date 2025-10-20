package atv_16;

import java.util.Random;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("aperte qualquer tecla");
        sc.nextLine();
        int soma = 0;
        int media;
        for (int i = 1; i < 12; i++) {
            int efic = rand.nextInt(1000);
            System.out.println("A temperatura no minuto" + i + " e de:" + efic + " %");
            soma += efic;
        }
        media = soma / 12;
        System.out.println("A media total é: " + media + " %");
    }
}
