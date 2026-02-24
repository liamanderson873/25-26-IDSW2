public class Artista {
    private String nombre;
    private Instrumento instrumento;
    private Manager manager;
    private SelloDiscografico sello;

    public Artista(String nombre, Instrumento instrumento, Manager manager, SelloDiscografico sello) {
        this.nombre = nombre;
        this.instrumento = instrumento;
        this.manager = manager;
        this.sello = sello;
    }

    public String getNombre() {
        return nombre;
    }

    public void interpretar() {
        instrumento.emitirNota();
    }
}