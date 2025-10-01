package atv_12c;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade");
        double n1 = sc.nextDouble();
        double soma = n1 *365;
        System.out.printf("sua idade em dias e de "+soma);
    }
}
