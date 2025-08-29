package Habilidades;

import Pokemon.Pokemon;

public class DobleFilo extends Habilidad {
    public DobleFilo() { super("Doble Filo"); }
    @Override
    public void usar(Pokemon usuario, Pokemon objetivo) {
        aplicarDanio(usuario, objetivo, 120);
        usuario.getVida().recibirDanio(20);
        System.out.println(usuario.getNombre() + " usó " + nombre + " causando mucho daño, pero se lastimó.");
    }
}