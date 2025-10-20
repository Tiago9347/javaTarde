package atv_13_08;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a velocidade");
        double n1 = sc.nextDouble();
        if (n1>=120) {
            System.out.println("reduzir a velocidade");
        }
        else {
            System.out.println("velocidade dentro do limite");
        }
    }
}
