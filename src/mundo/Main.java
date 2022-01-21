package mundo;

import modelo.*;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", TipoPokemon.ELETRICO);
        Pokemon pokemon2 = new Pokemon("Caterpie", TipoPokemon.INSETO);
        TreinadorPokemon treinadorPokemon = new TreinadorPokemon("Ash",10);
        CriadorPokemon criadorPokemon = new CriadorPokemon("Samantha",20);
        CentroPokemon centroPokemon = new CentroPokemon();
        criadorPokemon
        treinadorPokemon.capturarPokemon(pokemon1);
        treinadorPokemon.capturarPokemon(pokemon2);
        System.out.println(treinadorPokemon);

    }
}
