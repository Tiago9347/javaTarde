package atv_13_11;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a rede de trafego suspeito");
        int n1 = sc.nextInt();

        if (n1 >= 0 && n1 < 30) {
            System.out.println("normal");
        } else if (n1 >= 30 && n1 < 70) {
            System.out.println("alerta");
        } else if (n1 >= 70) {
            System.out.println("bloquear acesso");
        } else {
        }
    }
}
