package exemplo;

import java.util.Scanner;

public class estruturarepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        while (x != 0) { // enquanto x for diferente de 0
            soma += x; // neste pedaço estou pegando o que está sendo digitado
            x = sc.nextInt();
        }
        System.out.println(soma);
        sc.close();
    }
}
