package atv_12c;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor da compra");
        double n1 = sc.nextDouble();
        double soma = n1/3;
        System.out.printf("o valor da compra parcelado em 3x e de "+ soma);
    }
}
