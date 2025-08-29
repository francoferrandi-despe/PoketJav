package Pokemon.Estados;

import Habilidades.Habilidad;
import Pokemon.Pokemon;

public class Debilitado extends EstadoPokemon {
    @Override
    public void atacar(Pokemon pokemon, Pokemon objetivo, Habilidad habilidad) {
        System.out.println(pokemon.getNombre() + " está debilitado y no puede atacar.");
    }
    @Override
    public void finDeTurno(Pokemon pokemon) {}
}