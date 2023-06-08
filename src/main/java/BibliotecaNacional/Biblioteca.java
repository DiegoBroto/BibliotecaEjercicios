package BibliotecaNacional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;
    private List<Socio> socios;
    private List<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.prestamos = new ArrayList<>();

    }

    public void agegarLibro(Libro libro) {
        if (!this.libros.contains(libro)) {
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
        } else {
            System.out.println("el libro no existe");
        }
        return existe;
    }

    public List<Libro> buscarLibroPorIsbn(String codigoIsbn) {
        List<Libro> librosPorCodigo = new ArrayList<>();
        for (int x = 0; x < this.libros.size(); x++)
            if (this.libros.get(x).getCodigoisbn().equals(codigoIsbn))
                librosPorCodigo.add(this.libros.get(x));

        return librosPorCodigo;
    }

    public List<Libro> buscarLibroPorCategoria(String categoria) {
        List<Libro> librosPorCategoria = new ArrayList<>();
        for (int x = 0; x < this.libros.size(); x++)
            if (this.libros.get(x).getCategoria().equals(categoria))
                librosPorCategoria.add(this.libros.get(x));

        return librosPorCategoria;
    }

    public void agregarSocio(Socio socio) {
        if (!this.socios.contains(socio)) {
            this.socios.add(socio);
        }
    }

    public List<Socio> getSocios() {
        return new ArrayList<>(socios);
    }

    public List<Socio> buscarSocioPorDoc(Integer nroDoc) {
        List<Socio> socioPorDoc = new ArrayList<>();
        for (int x = 0; x < this.socios.size(); x++)
            if (this.socios.get(x).getNroDoc().equals(nroDoc))
                socioPorDoc.add(this.socios.get(x));

        return socioPorDoc;
    }

    public void prestamoLibro(Prestamo prestamo) {
        Libro libroAPrestar = this.buscarLibroPrestar(prestamo.getLibroPres());
        Socio socioSolicitante = this.buscarSocio(prestamo.getDocSocio());
        if (libroAPrestar == null || socioSolicitante == null) {
            System.out.println("no encontro el libro o el socio no existe");
        } else {
            this.prestamos.add(prestamo);
        System.out.println("Codigo de Libro ISBN a prestar: " + prestamo.getLibroPres() + " dni del socio:" + prestamo.getDocSocio());
        }
    }


    private Libro buscarLibroPrestar(String libroPres) {
        for (int x = 0; x < this.libros.size(); x++)
            if (this.libros.get(x).getCodigoisbn().equals(libroPres))
                return this.libros.get(x);

        return null;
    }

    private Socio buscarSocio(Integer docSocio) {
        for (int x = 0; x < this.socios.size(); x++)
            if (this.socios.get(x).getNroDoc().equals(docSocio))
                return this.socios.get(x);

        return null;
    }

    public List<Prestamo> getPrestamos() {
        return new ArrayList<>(prestamos);
    }
}
