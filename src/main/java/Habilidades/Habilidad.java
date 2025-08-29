package Habilidades;

import Pokemon.Pokemon;

public abstract class Habilidad {
    protected String nombre;
    public Habilidad(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public abstract void usar(Pokemon usuario, Pokemon objetivo);

    // helper para aplicar daño crítico según tipo
    protected void aplicarDanio(Pokemon atacante, Pokemon objetivo, int danioBase) {
        int danio = danioBase;
        if (objetivo.getTipo().esDebilContra(atacante.getTipo())) {
            danio += 20;
            System.out.println("¡Es un ataque crítico! +" + 20 + " de daño extra.");
        }
        objetivo.getVida().recibirDanio(danio);
    }
}