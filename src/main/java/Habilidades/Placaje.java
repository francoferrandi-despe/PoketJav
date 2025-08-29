package Habilidades;

import Pokemon.Pokemon;

public class Placaje extends Habilidad {
    public Placaje() { super("Placaje"); }
    @Override
    public void usar(Pokemon usuario, Pokemon objetivo) {
        aplicarDanio(usuario, objetivo, 20);
        System.out.println(usuario.getNombre() + " usó " + nombre + " causando daño.");
    }
}
