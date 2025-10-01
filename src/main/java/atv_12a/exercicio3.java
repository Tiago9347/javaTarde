package atv_12a;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        a = sc .nextDouble();
        System.out.println("digite o segundo numero");
        b = sc .nextDouble();
        System.out.println("Digite o terceiro numero");
        c = sc .nextDouble();
        System.out.println("Digite o quarto numero");
        d = sc .nextDouble();
        double  resultado = a * b - c * d;
        System.out.printf("A diferença e" +resultado);

    }
}
