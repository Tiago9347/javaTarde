package atv_16;

import java.util.Random;

public class exercicio8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int soma = 0;
        int horasPorAno = 365 * 24; // total de horas no ano

        for (int dia = 0; dia < 365; dia++) {
            int horasDia = rand.nextInt(24); // horas de operação aleatórias no dia (0 a 23)
            System.out.println("Dia: " + dia + " com " + horasDia + " horas de operação");
            soma += horasDia;
        }

        System.out.println("O total de horas de operação foi de: " + soma);
    }
}