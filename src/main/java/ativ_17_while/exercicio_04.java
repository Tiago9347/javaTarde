package ativ_17_while;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("===menu===");
            System.out.println("1 para registrar parada.");
            System.out.println("2 para registrar produção.");
            System.out.println("3 para sair.");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("parada registrada com sucesso. ");
                    break;
                case 2:
                    System.out.println("produção registrada com sucesso.");
                    break;
                case 3:
                    System.out.println("saindo do programa.");
                    break;
                default:
                    System.out.println("opção invalida.Tente novmente. ");
            }
            System.out.println();
        } while (opcao != 3);

        sc.close();
    }
}
