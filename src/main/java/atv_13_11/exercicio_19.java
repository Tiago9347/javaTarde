package atv_13_11;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nivel do PH");
        int n1 = sc.nextInt();
        if(n1<7) {
            System.out.println("Classificação: acido");
        }else if (n1 == 7) {
            System.out.println("Classificação: neutro");
        }else if (n1>8) {
            System.out.println("Classificação: basico");
        }
    }
}
