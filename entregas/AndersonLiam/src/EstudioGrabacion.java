public class EstudioGrabacion {
    private String ubicacion;

    public EstudioGrabacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void registrarAudio() {
        System.out.println("Grabando en " + ubicacion);
    }
}