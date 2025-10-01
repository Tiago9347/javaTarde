package atv_12b;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("escreva a sua idade");
        double idd = sc.nextDouble();
        double soma = idd/12;
        System.out.printf("o sua idade em meses e de "+ soma);
    }
}
