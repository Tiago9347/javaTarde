package atv_12c;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua altura");
        double A = sc.nextDouble();
        double pi = (72.7* A) - 58;
        System.out.printf("O peso ideal e de "+pi);
    }
}
