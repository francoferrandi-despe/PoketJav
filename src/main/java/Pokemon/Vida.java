package Pokemon;


public class Vida {
    private int vidaActual;
    private final int vidaMaxima;

    public Vida(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
        this.vidaActual = vidaMaxima;
    }

    public int getVidaActual() { return vidaActual; }
    public int getVidaMaxima() { return vidaMaxima; }
    public boolean estaDebilitado() { return vidaActual <= 0; }

    public void recibirDanio(int danio) {
        vidaActual = Math.max(0, vidaActual - danio);
    }

    public void curar(int puntos) {
        vidaActual = Math.min(vidaMaxima, vidaActual + puntos);
    }

    public void curacionTotal() {
        vidaActual = vidaMaxima;
    }
}
