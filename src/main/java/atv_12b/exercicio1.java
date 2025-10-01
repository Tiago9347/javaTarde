package atv_12b;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.printf("Digite o segundo numero");
        int n2 = sc.nextInt();
        int soma = n1+n2;
        System.out.println("Sua soma e de "+soma);
    }
}
