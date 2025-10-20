package atv_13_11;

import java.util.Scanner;

public class exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a porcentagem para o robo");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 15) {
            System.out.println("parar");
        } else if (n1 >= 15 && n1 < 50) {
            System.out.println("alerta");
        } else if (n1>= 50) {
            System.out.println("continuar");
        } else {

        }
    }
}
