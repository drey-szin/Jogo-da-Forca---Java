package application;

import entities.Categoria;
import entities.JogoForca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.printf("BEM-VINDO AO JOGO DA VELHA");
        System.out.println("ESCOLHA QUAL CATEGORIA GOSTARIA DE JOGAR: " +
                "\n 1- Times de Futebol Brasileiro" +
                "\n 2- Marcas de Carros" +
                "\n 3- Dinossauros" +
                "\n 4- Profissões" +
                "\n 5- Frutas" +
                "\n 6- Animais" +
                "\n 7- Países");
        System.out.printf("Escolha uma opção: ");
        int escolha = sc.nextInt();

        String palavra = new Categoria().escolherCategoria(escolha);

        var jogoForca = new JogoForca(palavra);
   }
}