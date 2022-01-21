package modelo;

public class Pokemon implements Ataque {
    private String nome;
    private TipoPokemon tipo;
    private Pessoa dono;
    private Integer hp;
    public Pokemon(String nome, TipoPokemon tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.hp = 100;
        dono = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Override
    public void atacar(Pokemon pokemonAdversario) {
        int dano = pokemonAdversario.getHp() - 10;
        pokemonAdversario.setHp(pokemonAdversario.getHp()-dano);
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }



}
