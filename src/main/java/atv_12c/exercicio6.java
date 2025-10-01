package atv_12c;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do depósito ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensal: ");
        double tj = sc.nextDouble();
        double rendimento = n1 * (tj / 100);
        double total = n1 + rendimento;
        System.out.printf("O rendimento após um mês será de", rendimento);
        System.out.printf("O valor total após um mês será de", total);
    }
}
