package Habilidades;

import Pokemon.Estados.Envenenado;
import Pokemon.Pokemon;

public class BombaLodo extends Habilidad {
    public BombaLodo() { super("Bomba Lodo"); }
    @Override
    public void usar(Pokemon usuario, Pokemon objetivo) {
        aplicarDanio(usuario, objetivo, 10);
        objetivo.setEstado(new Envenenado());
        System.out.println(usuario.getNombre() + " usó " + nombre + " y envenenó al enemigo.");
    }
}