package atv_13_08;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a energia ");
        double n1 = sc.nextDouble();
        if (n1>=200) {
            System.out.println("energia solar suficiente");
        }
        else {
            System.out.println("adicionar energia");
        }
    }
}
