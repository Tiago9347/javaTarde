package atv_13_08;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sensor de linha detecta operador?");
        String n1 = sc.nextLine();
        if (n1.equalsIgnoreCase("sim")) {
            System.out.println("pausar linha de produçao");
        }
        else {
            System.out.println("linha operando normalmente");
        }
    }
}
