package Combate;

import Accesorio.Moneda;
import Pokemon.Pokemon;

public class Combate {
    private Pokemon p1;
    private Pokemon p2;

    public Combate(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciar() {
        System.out.println("¡Comienza el combate entre " + p1.getNombre() + " y " + p2.getNombre() + "!");
        Pokemon atacante = Moneda.lanzar() ? p1 : p2;
        Pokemon defensor = (atacante == p1) ? p2 : p1;

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("\nTurno de " + atacante.getNombre());
            atacante.usarHabilidad(0, defensor); // Usa la primera habilidad disponible en todo el combate
            atacante.finDeTurno();
            defensor.finDeTurno();

            Pokemon temp = atacante;
            atacante = defensor;
            defensor = temp;
        }

        if (p1.estaVivo()) {
            System.out.println("\n¡" + p1.getNombre() + " ganó el combate!");
        } else {
            System.out.println("\n¡" + p2.getNombre() + " ganó el combate!");
        }
    }
}