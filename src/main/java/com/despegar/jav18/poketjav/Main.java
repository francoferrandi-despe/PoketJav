package com.despegar.jav18.poketjav;

import Combate.Combate;
import Habilidades.*;
import Pokemon.*;


public class Main {
    public static void main(String[] args) {
        Pokemon bulbasaur = new Pokemon("Bulbasaur", TipoPokemon.PLANTA, 100);
        bulbasaur.aprenderHabilidad(new Placaje());
        bulbasaur.aprenderHabilidad(new Canto());

        Pokemon charmander = new Pokemon("Charmander", TipoPokemon.FUEGO, 100);
        charmander.aprenderHabilidad(new BombaLodo());
        charmander.aprenderHabilidad(new DobleFilo());

        Combate combate = new Combate(bulbasaur, charmander);
        combate.iniciar();
    }
    }
