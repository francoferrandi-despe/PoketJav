package Habilidades;

import Pokemon.Estados.Dormido;
import Pokemon.Pokemon;

public class Canto extends Habilidad {
    public Canto() { super("Canto"); }
    @Override
    public void usar(Pokemon usuario, Pokemon objetivo) {
        objetivo.setEstado(new Dormido());
        System.out.println(usuario.getNombre() + " usó " + nombre + " y el objetivo se durmió.");
    }
}