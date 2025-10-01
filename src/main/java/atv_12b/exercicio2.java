package atv_12b;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o numero real desejado");
        double n1 = sc.nextInt();
        double soma = n1*2;
        System.out.println("o calculo e de "+soma);
    }
}
