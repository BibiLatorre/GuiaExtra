package Entidades;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioLibro {
    private ArrayList<Libro> ListadoLibros;

    public ServicioLibro() {
        this.ListadoLibros = new ArrayList<>();
    }

    public ServicioLibro(ArrayList<Libro> listaLibros) {
        this.ListadoLibros = listaLibros;
    }

    public Libro CrearLibro(String Titulo, String Autor, Integer Paginas) {
        Libro libro = new Libro(Titulo, Autor, Paginas);
        return libro;
    }

    public ArrayList<Libro> AgregarLibros() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar Libro");
        String fin = "";

        do {
            System.out.println("Ingresa el título del libro");
            String Titulo = input.next();
            System.out.println("Ingresa autor");
            String Autor = input.next();
            System.out.println("Digita número de páginas");
            int Paginas = input.nextInt();
            ListadoLibros.add(CrearLibro(Titulo, Autor, Paginas));
            System.out.println("Si desea ingresar otro libro presione S, de lo contrario presione otra tecla");
            fin = input.next();
        } while (fin.equalsIgnoreCase("S"));
        return ListadoLibros;

    }

    public void verListado() {
        for (Libro i : ListadoLibros
        ) {
            System.out.println(i);

        }
    }



    public void Mayor300(){
        for (Libro i: ListadoLibros ){
            if (i.getPaginas()>=300
            ) {
                System.out.println(i);

        }

        }


        }
        public void Menor150(){
            for (Libro i: ListadoLibros) {
             if (i.getPaginas()<=150) {
                    System.out.println(i);
                }
            }

    }
    }

