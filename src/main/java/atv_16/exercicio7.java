package atv_16;

import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int media;
        for (int i = 1; i < 41; i++) {
            int efic = rand.nextInt(60);
            System.out.println("tempo de soldagem " + i + " teve a duraçao de  " + efic + "");
            soma += efic;
        }
        media = soma / 41;
        System.out.println("A media total é: " + media );
    }
}