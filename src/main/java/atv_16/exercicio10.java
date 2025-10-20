package atv_16;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número total de embalagens testadas: ");
        int total = sc.nextInt();
        sc.nextLine();  
        int aprovadas = 0;

        for (int i = 1; i <= total; i++) {
            System.out.print("Embalagem " + i + " aprovada? (sim/nao): ");
            String resp = sc.nextLine();
            if (resp.equals("sim")) aprovadas++;
            else if (!resp.equals("nao")) {
                System.out.println("Resposta inválida! Tente novamente.");
                i--;
            }
        }

        System.out.printf("Porcentagem de embalagens aprovadas: %.2f%%\n", (aprovadas * 100.0) / total);
        sc.close();
    }
}