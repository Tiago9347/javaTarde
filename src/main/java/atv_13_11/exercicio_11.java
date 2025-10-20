package atv_13_11;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a bateria dos drones");
        int n1 = sc.nextInt();
        if (n1<20) {
            System.out.println("Retorno imediato");
        }else if (n1>20 && n1<60) {
            System.out.println("Rota curta");
        }else if (n1>60) {
            System.out.println("Rota longa");
        }
    }
}
