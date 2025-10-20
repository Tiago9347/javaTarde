package atv_13_08;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digitea produçao");
        double n1 = sc.nextDouble();
        if (n1>=100) {
            System.out.println("meta atingida");
        }
        else {
            System.out.println("produçao abaixo da meta");
        }
    }
}
