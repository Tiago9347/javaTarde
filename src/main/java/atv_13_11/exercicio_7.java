package atv_13_11;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do pacote");
        double peso = sc.nextDouble();

        if (peso<10) {
            System.out.println("Peso leve");
        }else if (peso>10 && peso<30) {
            System.out.println("Peso medio");
        }else if (peso>30 && peso<60) {
            System.out.println("Peso pesado");
        }else if (peso>60) {
            System.out.println("Peso muito pesado");
        }
    }
}
