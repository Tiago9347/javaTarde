package atv_13_11;

import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos ver a urgencia de manutenção das maquinas");
        System.out.println("Quantas horas a mquina tem de uso");
        double hora = sc.nextDouble();
        if (hora<500) {
            System.out.println("Baixa");
        }else if (hora>500 && hora<1000) {
            System.out.println("Media");
        }else if (hora>1000){
            System.out.println("Alta");
        }
    }
}
