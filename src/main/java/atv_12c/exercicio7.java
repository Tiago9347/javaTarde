package atv_12c;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a quantidade de KM");
        double n1 = sc.nextDouble();
        System.out.println("digite a quantidade de litros");
        double n2 = sc.nextDouble();
        double soma = n1/n2;
        System.out.println("a media de KM/L e de "+soma);
    }
}
