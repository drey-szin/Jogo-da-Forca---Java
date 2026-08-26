package entities;

import java.util.Random;

public class Categoria {
    Random rand = new Random();

    String[] timesFutebolBrasileiro = {"flamengo", "fluminense", "vasco", "botafogo", "palmeiras", "gremio", "internacional", "cruzeiro", "bahia", "bragantino", "coritiba", "corinthians", "vitoria", "santos", "remo", "chapecoense"};
    String[] marcasCarros = {"ferrari", "lamborghini", "fiat", "maserati", "volkswagen", "porsche", "tesla", "byd", "chevrolet", "cadillac", "ford", "honda", "subaru", "nissan", "lexus", "mercedes", "audi", "dodge", "jeep", "renault", "mitsubishi", "volvo", "suzuki", "peugeot", "kia", "ram", "hyundai", "citroen", "jaguar", "toyota", "bentley"};
    String[] dinossauros = {"tyranossauro", "triceratopes", "velociraptor", "megalodon", "spinossauro"};
    String[] profissao = {"advogado", "bombeiro", "policial","motorista", "taxista", "jardineiro", "cozinheiro", "piloto", "promotor", "caminhoneiro", "juiz", "atendente"};
    String[] frutas = {"banana", "maca", "morango", "abacaxi", "melancia", "uva", "manga", "laranja", "kiwi", "pera", "goiaba", "caju"};
    String[] animais = {"leao", "elefante", "girafa", "tigre", "zebra", "canguru", "golfinho", "tubarao", "coruja", "jacare", "tartaruga", "pinguim"};
    String[] paises = {"brasil", "alemanha", "portugal", "argentina", "japao", "canada", "italia", "espanha", "china", "franca", "mexico", "egito"};

    public String escolherCategoria(int escolha) {
        return switch (escolha) {
            case 1 -> timesFutebolBrasileiro[rand.nextInt(timesFutebolBrasileiro.length)];
            case 2 -> marcasCarros[rand.nextInt(marcasCarros.length)];
            case 3 -> dinossauros[rand.nextInt(dinossauros.length)];
            case 4 -> profissao[rand.nextInt(profissao.length)];
            case 5 -> frutas[rand.nextInt(frutas.length)];
            case 6 -> animais[rand.nextInt(animais.length)];
            case 7 -> paises[rand.nextInt(paises.length)];
            default -> ("ERROR: Nenhuma opção disponível foi selecionada!");
        };
    }

}