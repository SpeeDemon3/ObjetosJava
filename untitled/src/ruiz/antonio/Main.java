package ruiz.antonio;


public class Main {

    public static void main(String[] args) {

        SmartDevice caracteristicasComunes = new SmartDevice("Fabricante", "Modelo", 100, true || false, 32, 7000.5, 500, false,"Linux");

        System.out.println(caracteristicasComunes.duracionBateria);
        System.out.println(caracteristicasComunes.fabricante);
        System.out.println(caracteristicasComunes.modelo);
        System.out.println(caracteristicasComunes.memoriaRam);
        System.out.println(caracteristicasComunes.gps);
        System.out.println(caracteristicasComunes.procesador);
        System.out.println(caracteristicasComunes.sistemaOperativo);
        System.out.println(caracteristicasComunes.resistenciaAlAgua);
        System.out.println(caracteristicasComunes.memoriaAlmacenamiento);




        SmartPhone iphoneX = new SmartPhone("Apple", "Iphone X", 24, true, 8, 4000.3, 280, false, "Ios", "4G", 5);

        System.out.println("Caracteristicas Iphone X:");
        System.out.println(iphoneX.camaras);
        System.out.println(iphoneX.duracionBateria);
        System.out.println(iphoneX.fabricante);
        System.out.println(iphoneX.gps);
        System.out.println(iphoneX.memoriaAlmacenamiento);
        System.out.println(iphoneX.modelo);
        System.out.println(iphoneX.procesador);
        System.out.println(iphoneX.memoriaRam);
        System.out.println(iphoneX.sistemaOperativo);
        System.out.println(iphoneX.sim);
        System.out.println(iphoneX.resistenciaAlAgua);


        SmartWatch xiaomiRedmi = new SmartWatch( "Xiaomi", "Redmi", 50, true, "4", 100.0, 100, true, "Android", "Poliuretano", true, true);

        System.out.println("Caracteristicas Xiaomi Redmi Smart Watch:");
        System.out.println(xiaomiRedmi.adaptadorTarjetaSim);
        System.out.println(xiaomiRedmi.duracionBateria);
        System.out.println(xiaomiRedmi.fabricante);
        System.out.println(xiaomiRedmi.gps);
        System.out.println(xiaomiRedmi.materialCorrea);
        System.out.println(xiaomiRedmi.memoriaAlmacenamiento);
        System.out.println(xiaomiRedmi.modelo);
        System.out.println(xiaomiRedmi.memoriaRam);
        System.out.println(xiaomiRedmi.pulsometro);
        System.out.println(xiaomiRedmi.sistemaOperativo);
        System.out.println(xiaomiRedmi.procesador);
        System.out.println(xiaomiRedmi.resistenciaAlAgua);


    }




}
