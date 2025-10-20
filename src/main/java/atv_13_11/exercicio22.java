package atv_13_11;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a qualidade do ar");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 50) {
            System.out.println("bom");
        } else if (n1 >= 50 && n1 < 100) {
            System.out.println("moderado");
        } else if (n1 >= 100 && n1 < 200) {
            System.out.println("ruim");
        } else if (n1>= 200) {
            System.out.println("critico");
        } else {

        }
    }
}
