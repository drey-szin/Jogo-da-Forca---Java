package entities;

import java.util.Random;

public class Categorias {
    Random rand = new Random();

    String[] timesFutebolBrasileiro = {"flamengo", "fluminense", "vasco", "botafogo", "palmeiras", "gremio", "internacional", "cruzeiro", "bahia", "bragantino", "coritiba", "corinthians", "vitoria", "santos", "remo", "chapecoense"};
    String[] marcasCarros = {"ferrari", "lamborghini", "fiat", "maserati", "volkswagen", "porsche", "tesla", "byd", "chevrolet", "cadillac", "ford", "honda", "subaru", "nissan", "lexus", "mercedes", "audi", "dodge", "jeep", "renault", "mitsubishi", "volvo", "suzuki", "peugeot", "kia", "ram", "hyundai", "citroen", "jaguar", "toyota", "bentley"};
    String[] dinossauros = {"tyranossauro", "triceratopes", "velociraptors", "megalodon", "spinossauro"};

    public String escolherCategoria(int escolha){
        switch (escolha){
            case 1:
                return timesFutebolBrasileiro[rand.nextInt(timesFutebolBrasileiro.length)];
            case 2:
                return marcasCarros[rand.nextInt(marcasCarros.length)];
            case 3:
                return dinossauros[rand.nextInt(dinossauros.length)];
            default:
                return("ERROR: Nenhuma opção disponível foi selecionada!");
        }
    }

}