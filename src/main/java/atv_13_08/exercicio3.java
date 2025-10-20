package atv_13_08;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a energia");
        double n1 = sc.nextDouble();
        if (n1>=50) {
            System.out.println("Robo iniciando a pintura");
        }
        else {
            System.out.println("Energia insuficiente, recarergar");
        }
    }
}
