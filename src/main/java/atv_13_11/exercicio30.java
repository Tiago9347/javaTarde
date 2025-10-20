package atv_13_11;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 60) {
            System.out.println("normal");
        } else if (n1 >= 60 && n1 < 80) {
            System.out.println("resfriamento extra");
        } else if (n1>= 80) {
            System.out.println("desligar servidores");
        } else {

        }
    }
}
