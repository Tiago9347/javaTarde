package ativ_17_while;

import java.util.Scanner;

public class Exercicio_03_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c;

        do {
            System.out.print("Informe o codigo RFIDA: ");
            c = sc.nextLine();
        }while (c.length()!= 8);

        System.out.println("Codigo aceito");
    }
}
