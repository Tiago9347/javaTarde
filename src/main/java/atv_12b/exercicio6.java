package atv_12b;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite a temperatura em celsius");
        double n1 = sc.nextDouble();
        double soma = (n1*9/5)+32;
        System.out.printf("a temperatura em Fahrenheit e de "+ soma);
    }
}
