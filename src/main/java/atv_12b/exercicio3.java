package atv_12b;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escreva o raio do circulo");
        int n1 = sc.nextInt();
        double soma =  3.14 * (n1*n1);
        System.out.println("o raio do circulo e de" +soma);
    }
}
