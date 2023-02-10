import Entidades.ServicioLibro;

public class Main {
    public static void main(String[] args) {
        ServicioLibro servicioCarga = new ServicioLibro();
        servicioCarga.AgregarLibros();
        System.out.println("Libros ingresados: ");
        servicioCarga.verListado();

        System.out.println("\n"+"Libros con más de 300 páginas:");
        servicioCarga.Mayor300();

        System.out.println("\n"+"Libros con menos de 150 páginas: ");
        servicioCarga.Menor150();



    }
}