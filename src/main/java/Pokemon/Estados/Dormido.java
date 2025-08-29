package Pokemon.Estados;

import Accesorio.Moneda;
import Habilidades.Habilidad;
import Pokemon.Pokemon;

public class Dormido extends EstadoPokemon {
    @Override
    public void atacar(Pokemon pokemon, Pokemon objetivo, Habilidad habilidad) {
        System.out.println(pokemon.getNombre() + " está dormido y no puede atacar.");
    }
    @Override
    public void finDeTurno(Pokemon pokemon) {
        int lanzamientos = 2;
        int caras = 0;
        for (int i = 0; i < lanzamientos; i++) {
            if (Moneda.lanzar()) caras++;
        }
        boolean vidaBaja = pokemon.getVida().getVidaActual() <= pokemon.getVida().getVidaMaxima() / 2;
        if ((vidaBaja && caras >= 1) || (!vidaBaja && caras == 2)) {
            pokemon.setEstado(new Saludable());
            System.out.println(pokemon.getNombre() + " se ha despertado!");
        }
    }
}