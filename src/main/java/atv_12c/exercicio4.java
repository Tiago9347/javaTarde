package atv_12c;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota (peso 3): ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota (peso 2): ");
        double n2 = sc.nextDouble();
        double mediaPonderada = (n1 * 3 + n2 * 2) / (3 + 2);
        System.out.printf("A média ponderada é", mediaPonderada);
    }
}
