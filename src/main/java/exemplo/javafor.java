package exemplo;

import java.util.Locale;
import java.util.Scanner;

public class javafor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
            System.out.println("digite a temperatura em celsius");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5 + 32.2;
            System.out.printf("equivalente a fahrenheit : %.1f%n", f);
            System.out.println("Deseja repetir ( s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp!= 'n');
        sc.close();
        }
    }

