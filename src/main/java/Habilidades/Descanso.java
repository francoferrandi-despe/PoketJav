package Habilidades;

import Pokemon.Pokemon;

public class Descanso extends Habilidad {
    public Descanso() { super("Descanso"); }
    @Override
    public void usar(Pokemon usuario, Pokemon objetivo) {
        usuario.getVida().curar(20);
        System.out.println(usuario.getNombre() + " usó " + nombre + " y recuperó 20 puntos de vida.");
    }
}