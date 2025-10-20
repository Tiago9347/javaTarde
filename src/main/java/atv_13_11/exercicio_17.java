package atv_13_11;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O robô 1 falhou?");
        String r1 = sc.nextLine();
        if (r1.equalsIgnoreCase("sim")) {
            System.out.println("Vamos acionar o robô 2!");
            System.out.println("O robô 2 falhou?");
            String r2 = sc.nextLine();
            if (r2.equalsIgnoreCase("sim")) {
                System.out.println("Vamos parar a linha de produção!");
            }
        }else {
            System.out.println("Continuar aprodução");
        }
    }
}
