package atv_18;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite o numero para saber o fatorial");
        numero = sc.nextInt();

        int sta = max(numero);
        resultado(sta);
        sc.close();
    }
    public static int max(int numero){
        int fatorial = 1;
        int termo = 1;
        while (fatorial <= numero) {
            termo *= fatorial;
            fatorial++;
        }
        return termo;
    }
    public static void resultado(int resp) {
        System.out.println(resp);
    }
}
