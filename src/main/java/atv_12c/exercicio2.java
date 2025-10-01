package atv_12c;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade de horas");
        double n1 = sc.nextDouble();
        double soma = n1*60;
        System.out.printf("a quantidade de minutos e de "+soma);
    }
}
