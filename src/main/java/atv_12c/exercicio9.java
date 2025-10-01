package atv_12c;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a base maior");
        double B1 = sc.nextDouble();
        System.out.println("digite a base menor");
        double B2 = sc.nextDouble();
        System.out.println("digite a altura");
        double A = sc.nextDouble();
        double resultado = (B1 * B2)*A/2;
        System.out.printf("Sua area e de "+resultado);
    }
}
