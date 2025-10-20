package atv_13_11;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("qual a intensidade eletrica?");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 100) {
            System.out.println("fraca");
        } else if (n1 >= 100 && n1 < 200) {
            System.out.println("media");
        } else if (n1>= 200) {
            System.out.println("alta");
        } else {

        }
    }
}
