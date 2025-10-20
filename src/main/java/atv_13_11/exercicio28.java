package atv_13_11;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o estado da estrada (bloqueada, transito,normal): ");
        String tipoErro = sc.nextLine().toLowerCase();

        if (tipoErro.equals("bloqueada")) {
            System.out.println("recalcular a rota");
        } else if (tipoErro.equals("transito")) {
            System.out.println("rota alternativa");
        } else if (tipoErro.equals("normal")) {
            System.out.println("seguir normal");
        } else {
            System.out.println("opçao errada");
        }
    }
}
