package atv_13_11;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual a quantidade de bateria que tem na maquina");
        double n1 = sc.nextDouble();
        if (n1<=30) {
            System.out.println("A maquina deve entrar em modo economico");
        }else if (n1>=30 && n1<=70) {
            System.out.println("A maquina esta funcionando normalmente");
        }else if (n1>70) {
            System.out.println("A maquina ira entrar em modo turbo");
        }
    }
}
