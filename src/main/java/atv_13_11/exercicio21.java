package atv_13_11;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para verificar a carga");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 500) {
            System.out.println("permitido");
        } else if (n1 >= 500 && n1 < 1000) {
            System.out.println("alerta");
        } else if (n1>= 1001 ) {
            System.out.println("proibido");
        } else {

        }
    }
}
