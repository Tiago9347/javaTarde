package atv_13_08;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nivel de oleo");
        double n1 = sc.nextDouble();
        if (n1>=30) {
            System.out.println("nivel adequado");
        }
        else {
            System.out.println("adicionar oleo");
        }
    }
}
