package atv_13_08;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a portentagem de peças");
        double n1 = sc.nextDouble();
        if (n1>=90) {
            System.out.println("qualidade aceitavel");
        }
        else {
            System.out.println("qualidade abaixo do padrao");
        }
    }
}
