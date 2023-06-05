package BibliotecaNacional;

import java.util.Objects;

public class Libro {
    private String titulo;
    private String codigoisbn;
    private String autor;
    private String categoria;

    public Libro (String titulo, String codigoisbn, String autor, String categoria)
    {this.titulo = titulo;
        this.codigoisbn = codigoisbn;
        this.autor = autor;
        this.categoria = categoria;
    }
    public String getCodigoisbn() {
        return codigoisbn;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(getCodigoisbn(), libro.getCodigoisbn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoisbn());
    }

}
