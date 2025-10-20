package atv_13_11;

import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.printf("Para qual direção você quer que o robo ande %n");
            String frente = sc.nextLine();
            String esquerda = sc.nextLine();
            String direita = sc.nextLine();
            String tras = sc.nextLine();

            if (frente.equalsIgnoreCase("frentre")) {
                System.out.println("O robô andou para frente");
            } else if (esquerda.equalsIgnoreCase("esquerda")) {
                System.out.println("O robô andou para a esquerda");
            } else if (direita.equalsIgnoreCase("direita")) {
                System.out.println("O robô andou para a direita");
            } else if (tras.equalsIgnoreCase("tras")) {
                System.out.println("O robô andou para traz");
            } else {
                System.out.println("Direção invalida");
            }

    }
}
