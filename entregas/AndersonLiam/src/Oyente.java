public class Oyente {
    private String usuario;

    public Oyente(String usuario) {
        this.usuario = usuario;
    }

    public void escuchar(Cancion cancion, Dispositivo dispositivo) {
        System.out.println(usuario + " ha dado al play.");
        dispositivo.activarAltavoz();
        cancion.reproducir();
    }
}