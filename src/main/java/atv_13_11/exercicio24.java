package atv_13_11;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a quantidade do estoque");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 30) {
            System.out.println("reabastecer");
        } else if (n1 >= 30 && n1 < 10) {
            System.out.println("alerta");
        } else if (n1>= 300) {
            System.out.println("normal");
        } else {

        }
    }
}
