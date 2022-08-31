package ruiz.antonio;

public class SmartWatch extends SmartDevice{

    /**
     * Clase Hija
     */


    String materialCorrea;
    boolean pulsometro;
    boolean adaptadorTarjetaSim;

    public SmartWatch(String xiaomi, String redmi, int duracionBateria, boolean gps, String s, double procesador, int memoriaAlmacenamiento, boolean resistenciaAlAgua, String android, String poliuretano, boolean pulsometro, boolean adaptadorTarjetaSim){

    }

    public SmartWatch(String materialCorrea, boolean pulsometro, boolean adaptadorTarjetaSim) {
        this.materialCorrea = materialCorrea;
        this.pulsometro = pulsometro;
        this.adaptadorTarjetaSim = adaptadorTarjetaSim;
    }

    public SmartWatch(String fabricante, String modelo, int duracionBateria, boolean gps, int memoriaRam, double procesador, int memoriaAlmacenamiento, boolean resistenciaAlAgua, String sistemaOperativo, String materialCorrea, boolean pulsometro, boolean adaptadorTarjetaSim) {
        super(fabricante, modelo, duracionBateria, gps, memoriaRam, procesador, memoriaAlmacenamiento, resistenciaAlAgua, sistemaOperativo);
        this.materialCorrea = materialCorrea;
        this.pulsometro = pulsometro;
        this.adaptadorTarjetaSim = adaptadorTarjetaSim;
    }
}
