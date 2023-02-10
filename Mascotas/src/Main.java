import Entidades.ServicioMascota;

public class Main {
    public static void main(String[] args){
        ServicioMascota servicioCarga = new ServicioMascota();
        servicioCarga.AgregarMascota();
        System.out.println("Mascotas ingresadas");
        servicioCarga.verListado();
        System.out.println("\n"+"Mascotas con edad mayor a 6 años");
        servicioCarga.MayorA6Años();
        System.out.println("\n"+"Mascotas con edad menor a 5 años");
        servicioCarga.MenorA5Años();

    }

}

