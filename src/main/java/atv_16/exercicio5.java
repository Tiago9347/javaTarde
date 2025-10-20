package atv_16;

import java.util.Random;

public class exercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] consumos = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            consumos[i] = rand.nextInt(10) + 1;
            System.out.println("Máquina " + (i + 1) + ": consumo por hora = " + consumos[i] + " kWh");
            soma += consumos[i];
        }
        int consumoTotal24h = soma * 24;
        System.out.println("\nConsumo total em 24h: " + consumoTotal24h + " kWh");
    }
}