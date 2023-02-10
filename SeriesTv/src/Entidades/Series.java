package Entidades;

public class Series {
    private String Titulo;
    private int Categoría;
    private int Duracion;

    public Series() {
    }

    public Series(String titulo, int categoría, int duracion) {
       this.Titulo = titulo;
        this.Categoría = categoría;
        this.Duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getCategoría() {
        return Categoría;
    }

    public void setCategoría(int categoría) {
        Categoría = categoría;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    @Override
    public String toString() {
        return "Series{" +
                "Titulo='" + Titulo + '\'' +
                ", Categoría='" + Categoría + '\'' +
                ", Duracion=" + Duracion +
                '}';
    }
}
