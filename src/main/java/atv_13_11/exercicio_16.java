package atv_13_11;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe se o defeito das peças é visivel, micrscopico ou ausente");
        String visivel = sc.nextLine();
        String microscopico = sc.nextLine();
        String ausente = sc.nextLine();
        if(visivel.equalsIgnoreCase("visivel")) {
            System.out.println("Nivel alto");
        }else if (microscopico.equalsIgnoreCase("microscopico")) {
            System.out.println("Nivel medio");
        }else if (ausente.equalsIgnoreCase("ausente")) {
            System.out.println("Nivel baixo");
        }else{
            System.out.println("Ação invalida");
        }
    }
}
