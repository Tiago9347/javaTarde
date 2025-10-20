package atv_16;

import java.util.Random;

public class exercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int verificacao = rand.nextInt();
        for (int t=0; t<201; t++) {
            System.out.println("peças produzidas :"+ t );
            verificacao= rand.nextInt(200);
        }
        System.out.println("peças defeituosas :"+verificacao);
        double media = (double)  verificacao/200;
        System.out.printf("a media de peças defeituosas sao %.2f%%",media*100);


    }
}
