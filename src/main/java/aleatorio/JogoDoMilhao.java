package aleatorio;

import java.util.Scanner;

public class JogoDoMilhao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] perguntas = {
                "1) Qual é a capital do Brasil?",
                "2) Quem escreveu 'Dom Casmurro'?",
                "3) Qual o maior planeta do Sistema Solar?",
                "4) Em que ano o Brasil foi descoberto?",
                "5) Qual o símbolo químico do ouro?",
                "6) Quem pintou a Mona Lisa?",
                "7) Qual é o maior oceano do mundo?",
                "8) Quantos estados tem o Brasil?",
                "9) Qual o nome do atual presidente do Brasil? (2025)",
                "10) Quem foi o primeiro homem a pisar na Lua?",
                "11) Qual a fórmula da água?",
                "12) Quem é conhecido como o 'Rei do Futebol'?",
                "13) Qual é a língua oficial do Brasil?",
                "14) Em que continente fica o Egito?",
                "15) Qual o nome da maior floresta tropical do mundo?",
                "16) Quem descobriu o Brasil?",
                "17) Qual é a moeda do Japão?",
                "18) Qual país tem a maior população do mundo?",
                "19) Qual é a velocidade da luz?",
                "20) Quem escreveu 'A Divina Comédia'?"
        };

        String[][] opcoes = {
                {"a) Brasília", "b) Rio de Janeiro", "c) São Paulo", "d) Salvador"},
                {"a) Machado de Assis", "b) José de Alencar", "c) Carlos Drummond", "d) Jorge Amado"},
                {"a) Terra", "b) Júpiter", "c) Saturno", "d) Marte"},
                {"a) 1500", "b) 1600", "c) 1700", "d) 1800"},
                {"a) Au", "b) Ag", "c) Fe", "d) Hg"},
                {"a) Van Gogh", "b) Picasso", "c) Leonardo da Vinci", "d) Michelangelo"},
                {"a) Atlântico", "b) Pacífico", "c) Índico", "d) Ártico"},
                {"a) 26", "b) 27", "c) 28", "d) 29"},
                {"a) Lula", "b) Bolsonaro", "c) Temer", "d) Dilma"},
                {"a) Neil Armstrong", "b) Buzz Aldrin", "c) Yuri Gagarin", "d) Michael Collins"},
                {"a) H2O", "b) CO2", "c) O2", "d) NaCl"},
                {"a) Pelé", "b) Maradona", "c) Messi", "d) Ronaldo"},
                {"a) Espanhol", "b) Inglês", "c) Português", "d) Francês"},
                {"a) América", "b) África", "c) Ásia", "d) Europa"},
                {"a) Floresta Amazônica", "b) Floresta Negra", "c) Floresta de Sherwood", "d) Floresta Boreal"},
                {"a) Pedro Álvares Cabral", "b) Cristóvão Colombo", "c) Vasco da Gama", "d) Fernão de Magalhães"},
                {"a) Dólar", "b) Euro", "c) Iene", "d) Libra"},
                {"a) Índia", "b) Estados Unidos", "c) China", "d) Rússia"},
                {"a) 300 mil km/s", "b) 150 mil km/s", "c) 100 mil km/s", "d) 500 mil km/s"},
                {"a) Dante Alighieri", "b) William Shakespeare", "c) Fernando Pessoa", "d) Machado de Assis"}
        };

        char[] respostas = {
                'a', 'a', 'b', 'a', 'a', 'c', 'b', 'b', 'a', 'a',
                'a', 'a', 'c', 'b', 'a', 'a', 'c', 'c', 'a', 'a'
        };

        int pontuacao = 0;

        System.out.println("Bem-vindo ao Jogo do Milhão!");
        System.out.println("Responda as perguntas com a letra correspondente (a, b, c, d). Boa sorte!\n");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            for (String opcao : opcoes[i]) {
                System.out.println(opcao);
            }
            System.out.print("Resposta: ");
            char respostaUsuario = scanner.nextLine().toLowerCase().charAt(0);

            if (respostaUsuario == respostas[i]) {
                pontuacao += 100000; // cada pergunta vale 100 mil
                System.out.println("Resposta correta! Você tem R$ " + pontuacao + "!\n");
            } else {
                System.out.println("Resposta errada! O jogo acabou.");
                System.out.println("Você ganhou R$ " + pontuacao);
                break;
            }
        }

        if (pontuacao == perguntas.length * 100000) {
            System.out.println("Parabéns! Você ganhou o milhão!");
        }

    }
}
