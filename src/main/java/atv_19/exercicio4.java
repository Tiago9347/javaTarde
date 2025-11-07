package atv_19;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[6];
        int maior = 0, menor = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um numero");
            numero[i] = sc.nextInt();
            if (numero[i] > 0) {
                maior=numero[i];
            }else {
                menor=numero[i];
            }
        }
        System.out.println("Numero maior é: "+maior+"\nNumenor menor é: " +menor);
    }
}
