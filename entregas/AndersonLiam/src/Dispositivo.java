public class Dispositivo {
    private String modelo;

    public Dispositivo(String modelo) {
        this.modelo = modelo;
    }

    public void activarAltavoz() {
        System.out.println("Audio saliendo por " + modelo);
    }
}