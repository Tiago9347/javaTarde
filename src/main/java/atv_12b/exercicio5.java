package atv_12b;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salubrious do funcionário: R$ ");
        double n1 = scanner.nextDouble();

        double aumento = n1 * 0.10;
        double resultado = n1 + aumento;

        System.out.printf("O novo salário com 10%% de aumento é: R$ %.2f%n", resultado);
    }
}
