package atv_12a;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1:");
        int codigo1 = sc.nextInt();
        System.out.println("Digite o número de peças 1:");
        int quantidade1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1:");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2:");
        int codigo2 = sc.nextInt();
        System.out.println("Digite o número de peças 2:");
        int quantidade2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2:");
        double valor2 = sc.nextDouble();
        double total = (quantidade1 * valor1) + (quantidade2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
