package modelo;

import java.util.ArrayList;
import java.util.List;

public class CentroPokemon {
    private String nome;
    private List<Pokemon> pokemonsRegistrados;

    public CentroPokemon(){
        pokemonsRegistrados = new ArrayList<>();
    }
    public void curarPokemon(Pokemon pokemon){
        if(pokemon.getHp()<100)
        {
            pokemon.setHp(100);
        }
        this.pokemonsRegistrados.add(pokemon);
    }
    public void fichaPokemons(){
        if(pokemonsRegistrados.size()>0){
            System.out.println("Pokemons que já passaram pelo centro:");
            System.out.println(pokemonsRegistrados);
        }
        else{
            System.out.println("Sem registro de pokemons");
        }
    }
}
