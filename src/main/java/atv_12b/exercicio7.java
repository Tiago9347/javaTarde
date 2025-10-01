package atv_12b;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("escreva a quantidade de Dias");
        double dia = sc.nextDouble();
        double soma = dia/24;
        System.out.printf("o quantidade de dias e mhoras e de "+ soma);
    }
}
