package atv_13_11;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a velocidade que a esteira indica");
        int n1 = sc.nextInt();
        if (n1<20) {
            System.out.println("Velocidade lenta");
        }else if (n1>20 && n1<50) {
            System.out.println("Velocidade media");
        }else if (n1>100) {
            System.out.println("Alta velocidade");
        }
    }
}
