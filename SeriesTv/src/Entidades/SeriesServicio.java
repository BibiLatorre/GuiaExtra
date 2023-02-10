package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class SeriesServicio {
    private ArrayList <Series> ListadoSeries;
    public SeriesServicio() {this.ListadoSeries=new ArrayList<>();}
    public SeriesServicio (ArrayList<Series>listaseries){
        this.ListadoSeries=listaseries;
    }
    public Series CrearSerie (String Titulo, Integer Categoria, Integer Duracion){
        Series serie = new Series(Titulo, Categoria, Duracion);
        return serie;
    }

    public ArrayList<Series> AgregarSeries() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar Series");
        String fin= "";

        do {
            System.out.println("Ingresa el título de la serie");
            String Titulo = input.next();
            System.out.println("Especifica a qué categoría pertenece (Digita 1 para romance, 2 para comedia, 3 para drama)");
            int Categoria = input.nextInt();
            System.out.println("Digita la duración de la serie en minutos");
            int Duracion = input.nextInt();
            ListadoSeries.add (CrearSerie(Titulo, Categoria, Duracion));
            System.out.println("Si quieres ingresar otra serie digita S, de lo contrario cualquier otra tecla");
            fin = input.next();
        } while (fin.equalsIgnoreCase("S"));
        return ListadoSeries;

    }
    public void VerListado (){
        for (Series i:ListadoSeries
             ) {
            System.out.println(i);

        }
    }
    public void Romance (){
        for (Series i:ListadoSeries) {
            if (i.getCategoría()==1){
                System.out.println(i);
            }

        }
    }
    public void Comedia (){
        for (Series i:ListadoSeries) {
            if (i.getCategoría()==2){
                System.out.println(i);
            }

        }
    }

    public void Drama () {
        for (Series i : ListadoSeries) {
            if (i.getCategoría()==3){
                System.out.println(i);

            }
        }
    }

    public void menos15 () {
        for (Series i:ListadoSeries) {
            if (i.getDuracion()<15){
                System.out.println(i);
            }

        }
    }
    public void mas40 (){
        for (Series i:ListadoSeries) {
            if (i.getDuracion()>40){
                System.out.println(i);
            }

        }
    }


}
