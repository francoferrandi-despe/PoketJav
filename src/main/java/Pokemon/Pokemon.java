package Pokemon;
import java.util.ArrayList;
import java.util.List;
import Habilidades.Habilidad;
import Pokemon.Estados.Debilitado;
import Pokemon.Estados.EstadoPokemon;
import Pokemon.Estados.Saludable;


public class Pokemon {
    private String nombre;
    private TipoPokemon tipo;
    private Vida vida;
    private EstadoPokemon estado;
    private List<Habilidad> habilidades;

    public Pokemon(String nombre, TipoPokemon tipo, int vidaMaxima) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = new Vida(vidaMaxima);
        this.estado = new Saludable();
        this.habilidades = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public Vida getVida() { return vida; }
    public EstadoPokemon getEstado() { return estado; }
    public void setEstado(EstadoPokemon estado) { this.estado = estado; }
    public TipoPokemon getTipo() { return tipo; }

    public void aprenderHabilidad(Habilidad habilidad) {
        if (habilidades.size() >= 4) {
            habilidades.remove(0); // olvida la habilidad mas antigua
        }
        habilidades.add(habilidad);
    }

    public void usarHabilidad(int indice, Pokemon objetivo) {
        if (indice < 0 || indice >= habilidades.size()) {
            System.out.println(nombre + " no tiene esa habilidad.");
            return;
        }
        estado.atacar(this, objetivo, habilidades.get(indice));
    }

    public void finDeTurno() {
        estado.finDeTurno(this);
        if (vida.estaDebilitado()) {
            setEstado(new Debilitado());
        }
    }

    public boolean estaVivo() {
        return !vida.estaDebilitado();
    }
}