package atv_12c;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite valor da compra");
        double n1 = sc.nextDouble();
        double aumento = n1 * 0.50;
        double resultado = n1 + aumento;
        System.out.printf("O desconto e de ", resultado);
    }
}
