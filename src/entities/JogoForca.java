package entities;

import java.util.Random;
import java.util.Scanner;

public class JogoForca {
     Scanner sc = new Scanner(System.in);

     private int vidas = 5;
     private String palavra;
     private String erradas = "";
     private char letra;

     private boolean[] revelado;

    boolean vitoria = false;

    public JogoForca(String palavra) {
        this.palavra = palavra;
        revelado = new boolean[palavra.length()];

        while (vidas > 0 && !vitoria) {

            System.out.println("\nVidas: " + vidas);
            if (!erradas.isEmpty()) {
                System.out.println("Erradas: " + erradas);
            }

            System.out.print("\nDigite uma letra: ");
            String entrada = sc.next().toLowerCase();
            this.letra = entrada.charAt(0);

            boolean achou = testarLetra(letra);

            if(achou == true){
                System.out.println(letra + " está na palavra");
            } else {
                vidas--;
                erradas += letra + " ";
                System.out.println(letra + " não está na palavra");
            }
            System.out.println(progressoPalavra());

            if(isVitoria() == true){
                vitoria = true;
            }
        }
        fimDeJogo();
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

    public boolean isVitoria() {
        boolean correta = true;
        int i = 0;
        while (i < revelado.length) {
            if(!revelado[i]) {
                correta = false;
            }
            i++;
        }
        return correta;
    }
    public boolean testarLetra(char letra) {
        this.letra = letra;
        boolean achou = false;
        int j = 0;
        while (j < palavra.length()) {
            if (palavra.charAt(j) == this.letra) {
                revelado[j] = true;
                achou = true;
            }
            j++;
        }
        return achou;
    }
    public void fimDeJogo() {
        if (vitoria) {
            System.out.println("Você venceu! A palavra era: " + palavra);
        } else {
            System.out.println("Game Over! A palavra era: " + palavra);
        }
        sc.close();
    }
}
