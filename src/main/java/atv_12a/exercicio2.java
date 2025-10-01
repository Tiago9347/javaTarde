package atv_12a;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o raio do circulo");
        double n1 = sc .nextDouble();
        double resultado =3.14159*(n1*n1);
        System.out.printf("Seu resultado e"+ resultado);
    }
}
