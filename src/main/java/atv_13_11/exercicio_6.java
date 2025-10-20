package atv_13_11;

import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos metros do obstaculo que o sendor indica");
        int v = sc.nextInt();

        if (v<5) {
            System.out.println("O veiculo deve frear");
        }
        else if (v>5 && v<15) {
            System.out.println("Reduz a velocidade");
        }else if (v>15) {
            System.out.println("Acelerar");
        }
    }
}
