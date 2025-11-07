package atv_18;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Digite uma frase ou aperte ENTER para sair");
        frase = sc.nextLine();

        String sta = max(frase);
        resultado(sta);
        sc.close();
    }
    public static String max(String frase) {
        String sep;
        while (true) {
            String[] palavra = frase.split(" ");
            for (int i = 0; i< palavra.length; i++) {
                System.out.println("Separando palavras: "+palavra[i]+ " "+i);
            }
            sep= "Total de palavras: "+palavra.length;
            break;
        }
        return sep;
    }
    public static void resultado(String resp) {
        System.out.println(resp);
    }
}
