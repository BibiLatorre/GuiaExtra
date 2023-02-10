import Entidades.AutosServicio;

public class Main {
    public static void main(String[] args) {

        AutosServicio servicioCarga = new AutosServicio();
        servicioCarga.AgregarAuto();
        System.out.println("Autos ingresados");
        servicioCarga.VerListado();
        System.out.println("\n"+"Autos con stock menor a 3 unidades");
        servicioCarga.Menos3();
        System.out.println("\n"+"Autos con stock mayor a 10 unidades");
        servicioCarga.Mas10();

    }
}