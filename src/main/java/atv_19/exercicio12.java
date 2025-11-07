package atv_19;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.println("Digite o numero para montar a ordem");
            numeros[i] = sc.nextInt();
        }
        numeros[2] = 0;
        System.out.println("Numero alterado [");
        for (int i = 0; i<5; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1); {
                System.out.println(" ");
            }
        }
        System.out.println("Encerrando programa...");

    }
}
