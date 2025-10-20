package atv_13_11;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a inspençao final");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 10) {
            System.out.println("aprovar");
        } else if (n1 >= 10 && n1 < 20) {
            System.out.println("retrabalho");
        } else if (n1>= 20) {
            System.out.println("reprovar");
        } else {

        }
    }
}
