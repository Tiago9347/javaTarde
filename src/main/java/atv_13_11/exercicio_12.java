package atv_13_11;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você tem o crachá valido?");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Ok");
            System.out.println("Você tem o capacete de segurança?");
            String c = sc.nextLine();
            if (c.equalsIgnoreCase("sim")) {
                System.out.println("Ok");
                System.out.println("Digite seu horario de turno");
                double h = sc.nextDouble();
                if(h >9.00) {
                    System.out.println("Todas as condições verificadas");
                    System.out.println("Acesso liberado!");
                }
            }
        }else {
            System.out.println("Acesso negado");
        }
    }
}
