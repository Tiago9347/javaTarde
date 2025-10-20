package atv_13_11;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a energia solar disponivel");
        double n1 = sc.nextDouble();
        if (n1>70) {
            System.out.println("Usar apenas energia solar");
        }else if (n1>30 && n1<70) {
            System.out.println("Usar energia hibrida");
        }else if (n1<30) {
            System.out.println("Usar rede eletrica");
        }
    }
}
