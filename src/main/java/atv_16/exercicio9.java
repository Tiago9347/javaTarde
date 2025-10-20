package atv_16;

import java.util.Random;

public class exercicio9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int media;
        for (int i = 0; i < 11; i++) {
            int efic = rand.nextInt(100);
            System.out.println("o produto" + i + " teve a eficiencia de " + efic + "");
            soma += efic;
        }
        media = soma / 30;
        System.out.println("A media total é: " + media);
    }
}