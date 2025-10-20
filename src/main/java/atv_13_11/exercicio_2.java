package atv_13_11;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aprove os lotes");
        String l1 = sc.nextLine();
        if (l1.equalsIgnoreCase("aprovado")) {
            System.out.println("Lote 1 aprovado");
        } else if (l1.equalsIgnoreCase("reprovado")) {
            System.out.println("Lote 1 reprovado");
        }
        System.out.println("Lote 2");
        String l2 = sc.nextLine();
        if (l2.equalsIgnoreCase("aprovado")) {
            System.out.println("Lote 2 aprovado");
        } else if (l2.equalsIgnoreCase("reprovado")) {
            System.out.println("Lote 2 reprovado");
        }
        System.out.println("Lote 3");
        String l3 = sc.nextLine();
        if (l3.equalsIgnoreCase("aprovado")) {
            System.out.println("Lote 3 aprovado");
        } else if (l3.equalsIgnoreCase("reprovado")) {
            System.out.println("Lote 3 reprovado");
        }
        System.out.println("Lote 4");
        String l4 = sc.nextLine();
        if (l4.equalsIgnoreCase("aprovado")) {
            System.out.println("Lote 4 aprovado");
        } else if (l3.equalsIgnoreCase("reprovado")) {
            System.out.println("Lote 4 reprovado");
        }else{
            System.out.println("Você aprovou todos os lotes");
        }
    }
}