package atv_18;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura que ira converter");
        double temperatura = sc.nextDouble();
        System.out.println("Digite como deseja converter");
        String converter = sc.nextLine();

        double sta = max(temperatura, converter);
        resultado(sta);
        sc.close();
    }

    public static double max(double temperatura, String converter) {
        String conversao;
        double tc;
        if (converter.equalsIgnoreCase("Fahrenheit")) {
            tc = (9 / 5 * temperatura + 32);
        } else {
            tc = (5 / 9 * temperatura - 32);
        }
        return tc;
    }

    public static void resultado(double resp) {
        System.out.println(resp);
    }
}
