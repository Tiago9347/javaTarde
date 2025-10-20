package atv_13_11;

import java.util.Scanner;

public class exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de erro (critico, moderado, nenhum)");
        String tipoErro = scanner.nextLine().toLowerCase();

        if (tipoErro.equals("critico")) {
            System.out.println("Parar linha de produção imediatamente.");
        } else if (tipoErro.equals("moderado")) {
            System.out.println("Acionar equipe de manutenção.");
        } else if (tipoErro.equals("nenhum")) {
            System.out.println("Continuar produção normalmente.");
        } else {
            System.out.println("Tipo de erro inválido. Use: critico, moderado ou nenhum.");
        }
    }
}
