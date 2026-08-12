package application;

import entities.Categoria;
import entities.JogoForca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.printf("BEM-VINDO AO JOGO DA VELHA");
        System.out.println("ESCOLHA QUAL CATEGORIA GOSTARIA DE JOGAR: \n 1- Times de Futebol Brasileiro \n 2- Marcas de Carros \n 3- Dinossauros \n 4- Profissões");
        System.out.printf("Escolha uma opção: ");
        int escolha = sc.nextInt();

        String palavra = new Categoria().escolherCategoria(escolha);

        boolean[] revelado = new boolean [palavra.length()];
        boolean vitoria = false;


    }
}
