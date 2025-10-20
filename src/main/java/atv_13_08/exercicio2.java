package atv_13_08;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o estoque");
        double n1 = sc.nextDouble();
        if (n1>=20) {
            System.out.println("estoque suficiente");
        }
        else {
            System.out.println("reabastecer imediatamente");
        }
    }
}
