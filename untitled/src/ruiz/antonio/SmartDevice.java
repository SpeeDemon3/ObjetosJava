package ruiz.antonio;

public class SmartDevice {

    /**
     * Clase Padre
     */

    // Atributos

    String fabricante;
    String modelo;
    int duracionBateria;
    boolean gps;
    int memoriaRam ;
    double procesador;
    int memoriaAlmacenamiento;
    boolean resistenciaAlAgua;

    String sistemaOperativo;




    // Constructor


    public SmartDevice() {
    }

    public SmartDevice(String fabricante, String modelo, int duracionBateria, boolean gps, int memoriaRam, double procesador, int memoriaAlmacenamiento, boolean resistenciaAlAgua, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.duracionBateria = duracionBateria;
        this.gps = gps;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    // Metodo

    public void bateria(int horas) {
        this.duracionBateria += horas;
    }


}
