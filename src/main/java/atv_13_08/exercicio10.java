package atv_13_08;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o total de peso ");
        double n1 = sc.nextDouble();
        if (n1>=500) {
            System.out.println("capacidade exedida");
        }
        else {
            System.out.println("peso dentro do limite");
        }
    }
}
