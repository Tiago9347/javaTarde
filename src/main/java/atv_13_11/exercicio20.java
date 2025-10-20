package atv_13_11;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        if (hora >= 0 && hora < 12) {
            System.out.println("Turno: Manhã");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Turno: Tarde");
        } else if (hora >= 18 && hora < 24) {
            System.out.println("Turno: Noite");
        } else {
            System.out.println("Hora inválida. Digite um valor entre 0 e 23.");
        }

    }
}
