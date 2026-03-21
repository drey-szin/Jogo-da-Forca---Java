import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Array das palavras que podem ser sorteadas
        String[] palavras = {"flamengo", "libertadores", "ferrari", "audi", "bisao", "australopitecos", "diamante", "ben10", "casa", "jardim", "maça", "banana", "girassol", "orquidea", "advogado", "picanha", "alcatra", "esmeralda", "coxinha", "matematica", "tyranossauro", "mamute", "brasil", "alemanha", "deputado", "leitura", "anime", "manga", "naruto"};
        String palavra = palavras[rand.nextInt(palavras.length)];
        String erradas = "";
        int vidas = 6;
        boolean[] revelado = new boolean [palavra.length()];
        boolean vitoria = false;

        while (vidas > 0 && !vitoria) {
            System.out.println("\nVidas: " + vidas);
            if (!erradas.isEmpty()) {
                System.out.println("Erradas: " + erradas);
            }

            int i = 0;
            int acertos = 0;
            while (i < palavra.length()) {
                if (revelado[i]) {
                    System.out.println(palavra.charAt(i) + ""); //charAt() utilizado para retornar o caractere (char) em uma posição (índice) específica de uma String
                    acertos++; //incrementar se o usuario acertou
                } else {
                    System.out.print("_");
                }
                i++;
            }
            System.out.println();

            if (acertos == palavra.length()) {
                vitoria = true;
                break;
            }
            System.out.println("\nDigite uma letra: ");
            String entrada = sc.next().toLowerCase();
            char letra = entrada.charAt(0);

            boolean achou = false;
            int j = 0;
            while (j < palavra.length()) {
                if (palavra.charAt(j) == letra) {
                    revelado[j] = true;
                    achou = true;
                }
                j++;
            }
            if (!achou && erradas.indexOf(letra) == -1) {
                erradas += letra + " ";
                vidas--;
                System.out.println(letra + " não está na palavra");
            } else if (achou) {
                System.out.println(letra + " está na palavra");
            }
        }
        if (vitoria) {
            System.out.println("Você venceu! A palavra era: " + palavra);
        } else {
            System.out.println("Game Over! A palavra era: " + palavra);
        }
        sc.close();
    }
}
