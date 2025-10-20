package atv_13_11;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os dados de temperatura");
        double t = sc.nextDouble();
        if (t<0) {
            System.out.println("Alerta de congelamento");
        }else if (t<40) {
            System.out.println("Temperatura normal");
        }else if (t>40){
            System.out.println("Alerta de super aquecimento");
        }
    }
}
