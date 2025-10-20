package atv_16;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ENTER");
        sc.nextLine();
        int soma = 0;
        int media;
        for (int i = 1; i < 101; i++) {
            int efic = rand.nextInt(100);
            System.out.println("A maquina: " + i + " tem sua eficiencia em:" + efic + " %");
            soma += efic;
        }
        media = soma / 100;
        System.out.println("A media total é: " + media + " %");
    }
}