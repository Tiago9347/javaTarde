package atv_13_08;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de defeitos do lote ");
        double n1 = sc.nextDouble();
        if (n1>=5) {
            System.out.println("lote reprovado");
        }
        else {
            System.out.println("lote aprovado");
        }
    }
}
