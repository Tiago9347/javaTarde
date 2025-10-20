package atv_13_11;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos de produção tem por hora");
        int n1 = sc.nextInt();
        if (n1<50) {
            System.out.println("Baixo desemprenho");
        }else if (n1>50 && n1<100) {
            System.out.println("Regular");
        }else if (n1>100) {
            System.out.println("Otimo desempenho");
        }
    }
}
