package modelo;

import java.util.ArrayList;
import java.util.List;

public class CriadorPokemon extends Pessoa {
    private List<Pokemon> pokemonList;
    public CriadorPokemon(String nome, Integer idade) {
        super(nome, idade);
        pokemonList = new ArrayList<>();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public void capturarPokemon(Pokemon pokemonCapturado){
        if(pokemonCapturado!=null){
            pokemonCapturado.setDono(this);
            this.getPokemonList().add(pokemonCapturado);
        }
    }

    @Override
    public String toString() {
        return "Criador Pokemon{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pokemons capturados=" + pokemonList +
                '}';
    }
}
