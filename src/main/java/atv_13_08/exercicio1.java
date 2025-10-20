package atv_13_08;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura ");
        double n1 = sc.nextDouble();
        if (n1>=80) {
            System.out.println("maquina super-aquecida");
        }
        else {
            System.out.println("maquina operando normalmente");
        }
    }
}
