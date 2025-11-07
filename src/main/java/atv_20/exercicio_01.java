package atv_20;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite a lista de nomes:");
        String nomes= sc.nextLine();

        String[] nomesVect= nomes.split(",");
        int contador=1;

        for (String indice : nomesVect){
            System.out.println(contador+"º- "+indice);
            contador++;
        }
        sc.close();
    }
}
