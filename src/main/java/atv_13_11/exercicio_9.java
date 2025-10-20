package atv_13_11;

import java.util.Scanner;

public class exercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inform o indice de deifeito do lote");
        double n1 = sc.nextDouble();
        if(n1>10) {
            System.out.println("Acione o alerta");
        }else if(n1<10) {
            System.out.println("Lote aprovado");
        }
    }
}
