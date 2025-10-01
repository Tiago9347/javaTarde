package atv_12b;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a base do triangulo");
        double n1 = sc.nextDouble();
        System.out.printf("Digite a altura do triangulo");
        double n2 = sc.nextDouble();
        double soma = (n1*n2)/2;
        System.out.println("sua area e de "+soma);
    }
}
