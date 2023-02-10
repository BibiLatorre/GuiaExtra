package Entidades;

public class Libro {
    String Titulo, Autor;
    int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
