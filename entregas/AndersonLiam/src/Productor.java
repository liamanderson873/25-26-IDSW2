public class Productor {
    private String nombre;
    private EstudioGrabacion estudio;

    public Productor(String nombre, EstudioGrabacion estudio) {
        this.nombre = nombre;
        this.estudio = estudio;
    }

    public void trabajar() {
        estudio.registrarAudio();
    }
}