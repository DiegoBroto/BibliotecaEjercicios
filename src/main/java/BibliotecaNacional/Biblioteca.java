package BibliotecaNacional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca (String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();

    }
    public void agegarLibro(Libro libro) {
        if (!this.libros.contains(libro)){
            this.libros.add(libro);
        }

    }


    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }


    public boolean buscarLibro(Libro libro) {

        boolean existe = this.libros.contains(libro);
        if (existe) {
            System.out.println("el libro existe");
        }else{
            System.out.println("el libro no existe");
        }
        return existe;
    }

    public List<Libro> buscarLibroPorIsbn(String codigoIsbn) {
        List<Libro> librosPorCodigo = new ArrayList<>();
        for (int x = 0; x < this.libros.size(); x++)
            if(this.libros.get(x).getCodigoisbn().equals(codigoIsbn))
                librosPorCodigo.add(this.libros.get(x));

        return librosPorCodigo;
    }
    public List<Libro> buscarLibroPorCategoria(String categoria) {
        List<Libro> librosPorCategoria = new ArrayList<>();
        for (int x = 0; x < this.libros.size(); x++)
            if(this.libros.get(x).getCategoria().equals(categoria))
                librosPorCategoria.add(this.libros.get(x));

        return librosPorCategoria;
    }

}
