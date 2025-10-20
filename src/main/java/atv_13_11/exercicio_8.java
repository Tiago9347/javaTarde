package atv_13_11;

import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de material de impressão");
        double n1 = sc.nextInt();
        if (n1<20) {
            System.out.println("trocar material");
        }else if (n1>20) {
            System.out.println("Continuuar imprimindo");
        }
    }
}
