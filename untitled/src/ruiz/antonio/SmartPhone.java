package ruiz.antonio;

public class SmartPhone extends SmartDevice{

    /**
     * Clase Hija
     */

    String sim;
    int camaras;


    public SmartPhone() {

    }
    public SmartPhone(String sim, int camaras) {
        this.sim = sim;
        this.camaras = camaras;
    }

    public SmartPhone(String fabricante, String modelo, int duracionBateria, boolean gps, int memoriaRam, double procesador, int memoriaAlmacenamiento, boolean resistenciaAlAgua, String sistemaOperativo, String sim, int camaras) {
        super(fabricante, modelo, duracionBateria, gps, memoriaRam, procesador, memoriaAlmacenamiento, resistenciaAlAgua, sistemaOperativo);
        this.sim = sim;
        this.camaras = camaras;
    }
}
