package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class AutosServicio {
    private ArrayList<Autos> ListaAutos;

    public AutosServicio() {
        this.ListaAutos = new ArrayList<>();
    }


    public AutosServicio(ArrayList<Autos> listaAutos) {
        this.ListaAutos = listaAutos;
    }

    public Autos crearAuto(String Marca, Integer Stock) {
        Autos autos = new Autos(Marca, Stock);
        return autos;
    }

    public ArrayList<Autos> AgregarAuto() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa los datos solicitados.  Para finalizar digita 0 en la cantidad");
        String Marca = "";
        int Stock =0;

        do {
            System.out.println("Ingresa marca de auto");
            Marca = input.next();
            System.out.println("Ingresa cantidad de autos en stock");
            Stock = input.nextInt();
            ListaAutos.add(crearAuto(Marca, Stock));
        } while (Stock != (0));
        return ListaAutos;


    }

        public void VerListado () {
            for (Autos i : ListaAutos
            ) {
                System.out.println(i);
            }
        }

                public void Menos3() {
                    for (Autos i : ListaAutos) {
                        if (i.getStock() <= 3) {
                            System.out.println(i);
                        }
                    }
                }

                 public void Mas10(){
                        for (Autos i:ListaAutos) {
                            if (i.getStock()>=10){
                                System.out.println(i);
                            }

                        }

                }

    }
