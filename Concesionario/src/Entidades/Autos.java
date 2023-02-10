package Entidades;

public class Autos {
    String Marca;
    int Stock;

    public Autos() {
    }

    public Autos(String marca, int stock) {
        this.Marca = marca;
        this.Stock = stock;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    @Override
    public String toString() {
        return "Autos{" +
                "Marca='" + Marca + '\'' +
                ", Stock=" + Stock +
                '}';
    }
}
