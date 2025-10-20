package atv_13_08;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de peças");
        double n1 = sc.nextDouble();
        if (n1>=0) {
            System.out.println("Montagem em andamento");
        }
        else {
            System.out.println("verificar robo");
        }
    }
}
