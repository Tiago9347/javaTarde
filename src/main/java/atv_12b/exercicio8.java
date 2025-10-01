package atv_12b;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite dois numeros inteiros");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        double soma = (n1 + n2)/2 ;
        System.out.println("a soma e de "+soma);
    }
}
