package atv_13_11;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura da mquina");
        double n1 = sc.nextInt();
        if (n1>90) {
            System.out.println("Maquina desligada por emergencia");
        }else if (n1>80) {
            System.out.println("A maquina entrara em modo de vibração");
        }
    }
}
