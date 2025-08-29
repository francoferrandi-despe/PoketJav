package Pokemon.Estados;

import Habilidades.Habilidad;
import Pokemon.Pokemon;

public class Saludable extends EstadoPokemon {
    @Override
    public void atacar(Pokemon pokemon, Pokemon objetivo, Habilidad habilidad) {
        habilidad.usar(pokemon, objetivo);
    }
    @Override
    public void finDeTurno(Pokemon pokemon) {}
}
