package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioMascota {
    private ArrayList<Mascota> ListaMascotas;

    public ServicioMascota() {
        this.ListaMascotas= new ArrayList<>();
    }

    public ServicioMascota(ArrayList<Mascota> listaMascotas) {
        this.ListaMascotas = listaMascotas;
    }
    public Mascota CrearMascota (String Nombre, String Tipo, Integer Edad) {
        Mascota mascota = new Mascota(Nombre, Tipo, Edad);
        return mascota;
    }

    public ArrayList<Mascota> AgregarMascota (){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar mascota");
        String fin = "";

        do{
            System.out.println("Escribe el nombre de la mascota");
            String Nombre = input.next();
            System.out.println("Ingresa a qué especie pertenece la mascota");
            String Tipo = input.next();
            System.out.println("Digita la edad de la mascota");
            int Edad= input.nextInt();

            ListaMascotas.add (CrearMascota(Nombre, Tipo, Edad));
            System.out.println("Si deseas ingresar otra mascota presiona la tecla S, de lo contrario presiona cualquier otra tecla");
            fin=input.next();
        } while (fin.equalsIgnoreCase("S"));
        return ListaMascotas;
    }
    public void verListado (){
        for (Mascota i: ListaMascotas
             ) {
            System.out.println(i);

        }
    }

    public void MayorA6Años(){
        for (Mascota i:ListaMascotas) {
            if (i.getEdad()>=6){
                System.out.println(i);
            }

        }
    }

    public void MenorA5Años() {
        for (Mascota i : ListaMascotas
        ) {
            if (i.getEdad() < 6) {
                System.out.println(i);
            }
        }
    }

}

