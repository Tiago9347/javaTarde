package atv_15;

import java.util.Scanner;

public class ati_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conta = 0;
        double st = 0.0;

        while (conta < 24) {
            System.out.print("Digite a temperatura medida na hora " + (conta + 1) + ": ");
            double temperatura = sc.nextDouble();

            st += temperatura;
            conta++;
        }

        double media = st / 24;
        System.out.println("A média de temperatura das 24 horas foi de  " + media + "°C");
    }
}