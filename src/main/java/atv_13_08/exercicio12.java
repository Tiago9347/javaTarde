package atv_13_08;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a eficiencia de produçao");
        double n1 = sc.nextDouble();
        if (n1>=85) {
            System.out.println("eficiencia aceitavel");
        }
        else {
            System.out.println("manutençao recomendada");
        }
    }
}
