package atv_13_08;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos KG");
        double n1 = sc.nextDouble();
        if (n1>=5) {
            System.out.println("peça pesada");
        }
        else {
            System.out.println("peça leve");
        }
    }
}
