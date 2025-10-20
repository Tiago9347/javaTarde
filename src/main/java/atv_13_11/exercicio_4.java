package atv_13_11;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual tipo de operador você é");
        String op = sc.nextLine();
        String op2 = sc.nextLine();
        String op3 = sc.nextLine();

        if (op.equalsIgnoreCase("basico")) {
            System.out.println("Acesso restrito!");
        }else if (op2.equalsIgnoreCase("supervisor")) {
            System.out.println("Acesso parcial");
        }else if (op3.equalsIgnoreCase("engenheiro")) {
            System.out.println("Acesso total");
        }
    }
}
