package Pokemon.Estados;


import Habilidades.Habilidad;
import Pokemon.Pokemon;

public abstract class EstadoPokemon {
    public abstract void atacar(Pokemon pokemon, Pokemon objetivo, Habilidad habilidad);
    public abstract void finDeTurno(Pokemon pokemon);

    public void revivir(Pokemon pokemon) {
        pokemon.setEstado(new Saludable());
        pokemon.getVida().curacionTotal();
    }
}