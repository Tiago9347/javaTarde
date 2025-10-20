package atv_13_08;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de material ");
        double n1 = sc.nextDouble();
        if (n1>=0) {
            System.out.println("impressao iniciada");
        }
        else {
            System.out.println("sem material disponivel");
        }
    }
}
