package Pokemon;

public enum TipoPokemon {
    PLANTA, FUEGO, AGUA, ELECTRICO, LUCHA, PSIQUICO;

    private TipoPokemon debilidad;

    static {
        PLANTA.debilidad = FUEGO;
        FUEGO.debilidad = AGUA;
        AGUA.debilidad = ELECTRICO;
        ELECTRICO.debilidad = LUCHA;
        LUCHA.debilidad = PSIQUICO;
        PSIQUICO.debilidad = PSIQUICO;
    }

    public boolean esDebilContra(TipoPokemon atacante) {
        return atacante == this.debilidad;
    }
}
