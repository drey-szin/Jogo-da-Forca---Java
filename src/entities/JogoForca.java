package entities;

import java.util.Scanner;

public class JogoForca {
    Scanner sc = new Scanner(System.in);

    int vidas = 5;
    String palavra;
    String erradas = "";
    boolean[] revelado;

    boolean vitoria = false;

    public JogoForca(String palavra) {
        this.palavra = palavra;
        boolean[] revelado = new boolean[palavra.length()];

        while (vidas > 0 && !vitoria) {
            System.out.println("\nVidas: " + vidas);
            if (!erradas.isEmpty()) {
                System.out.println("Erradas: " + erradas);
            }
            public String progressoPalavra(){

                int i = 0;
                String resposta = "";
                while (i < palavra.length()) {
                    if (revelado[i]) {
                        resposta += palavra.charAt(i);
                    } else {
                        resposta += "_";
                    }
                    i++;
                }
                return resposta;
            }

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
