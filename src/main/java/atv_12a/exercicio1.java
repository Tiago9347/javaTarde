package atv_12a;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        Double n1 = sc .nextDouble();
        System.out.println("digite o segundo numero");
        Double n2 = sc .nextDouble();
        double  resultado = n1 + n2;
        System.out.println("Seu resultado e "+ resultado);
    }
}
