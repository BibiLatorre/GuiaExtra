import Entidades.SeriesServicio;

public class Main {
    public static void main(String[] args) {

        SeriesServicio servicioCarga = new SeriesServicio();
        servicioCarga.AgregarSeries();
        System.out.println("Series ingresadas: ");
        servicioCarga.VerListado();
        System.out.println("\n"+"Categoría Romance: ");
        servicioCarga.Romance();
        System.out.println("\n"+ "Categoría Drama: ");
        servicioCarga.Drama();
        System.out.println("\n"+ "Categoría Comedia: ");
        servicioCarga.Comedia();
        System.out.println("\n"+ "Series con duración menor a 15 minutos: ");
        servicioCarga.menos15();
        System.out.println("\n"+ "Series con duración mayor a 40 minutos: ");
        servicioCarga.mas40();


    }


}