package Pokemon.Estados;

import Habilidades.Habilidad;
import Pokemon.Pokemon;

public class Envenenado extends EstadoPokemon {
    @Override
    public void atacar(Pokemon pokemon, Pokemon objetivo, Habilidad habilidad) {
        habilidad.usar(pokemon, objetivo);
    }
    @Override
    public void finDeTurno(Pokemon pokemon) {
        pokemon.getVida().recibirDanio(10);
        System.out.println(pokemon.getNombre() + " sufre 10 de daño por el veneno.");
    }
}