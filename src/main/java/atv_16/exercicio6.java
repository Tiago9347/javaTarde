package atv_16;

import java.util.Random;

public class exercicio6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int media;
        for (int i = 1; i < 31; i++) {
            int efic = rand.nextInt(500);
            System.out.println("no dia " + i + " o estoque e de  " + efic + "");
            soma += efic;
        }
        media = soma / 50;
        System.out.println("A media total é: " + media );
    }
}