public class Cancion {
    private String titulo;
    private Artista artista;
    private Productor productor;
    private GeneroMusical genero;

    public Cancion(String titulo, Artista artista, Productor productor, GeneroMusical genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.productor = productor;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " - " + artista.getNombre());
    }
}