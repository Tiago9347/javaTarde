package atv_12a;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do salario");
        a = sc .nextDouble();
        System.out.println("digite quantas horas de trabalho");
        b = sc .nextDouble();
        System.out.println("digite o valor a multiplicar");
        c = sc .nextDouble();
        double resultado = b * c;
        System.out.printf("Number="+a);
        System.out.println(" ");
        System.out.printf("Salary = US"+ resultado
        );


    }
}
