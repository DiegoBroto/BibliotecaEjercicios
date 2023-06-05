import BibliotecaNacional.Biblioteca;
import BibliotecaNacional.Libro;
import BibliotecaNacional.Socio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    @Test
    void agregarLibrosTest (){
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotterPiedraFilosofal = new Libro ("Harry Potter y la piedra filosofal", "0001", "J. K. Rowling", "Literatura");
        Libro harryPotterCamaraSecreta = new Libro ( "Harry Potter y la camara secreta",  "0002", "J. K. Rowling", "Literatura");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principiantes",  "0003", "Dieguito Casti", "Aprendizaje");
        Libro aprendiendoJavaE = new Libro ( "Aprendiendo Java Expertos",  "0004", "Dieguito Casti", "Aprendizaje");

        //act
        biblioteca.agegarLibro(harryPotterCamaraSecreta);
        biblioteca.agegarLibro(harryPotterPiedraFilosofal);
        biblioteca.agegarLibro(aprendiendoJavaP);
        biblioteca.agegarLibro(aprendiendoJavaE);

        //assert
        assertEquals(4, biblioteca.getLibros().size());

    }
    @Test
    void controlDuplicadosTest (){
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principienates", "0003", "Dieguito Casti", "Aprendizaje");

        //act
        biblioteca.agegarLibro(aprendiendoJavaP);
        biblioteca.agegarLibro(aprendiendoJavaP);

        //assert
        assertEquals(1, biblioteca.getLibros().size());
    }
    @Test
    void buscarLibroTest () {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotterPiedraFilosofal = new Libro ("Harry Potter y la piedra filosofal", "0001", "J. K. Rowling", "Literatura");
        Libro harryPotterCamaraSecreta = new Libro ( "Harry Potter y la camara secreta",  "0002", "J. K. Rowling", "Literatura");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principiantes",  "0003", "Dieguito Casti", "Aprendizaje");
        Libro aprendiendoJavaE = new Libro ( "Aprendiendo Java Expertos",  "0004", "Dieguito Casti", "Aprendizaje");

        //act
        biblioteca.agegarLibro(aprendiendoJavaP);
        boolean existe = biblioteca.buscarLibro(aprendiendoJavaP);

        //assert
        assertTrue(existe);

    }
    @Test
    void buscarLibroFailTest () {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotterPiedraFilosofal = new Libro ("Harry Potter y la piedra filosofal", "0001", "J. K. Rowling", "Literatura");
        Libro harryPotterCamaraSecreta = new Libro ( "Harry Potter y la camara secreta",  "0002", "J. K. Rowling", "Literatura");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principiantes",  "0003", "Dieguito Casti", "Aprendizaje");
        Libro aprendiendoJavaE = new Libro ( "Aprendiendo Java Expertos",  "0004", "Dieguito Casti", "Aprendizaje");

        //act
        biblioteca.agegarLibro(aprendiendoJavaP);
        boolean existe = biblioteca.buscarLibro(aprendiendoJavaE);

        //assert
        assertFalse(existe);

    }
    @Test
    void buscarLibroPorCodigoTest () {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotterPiedraFilosofal = new Libro ("Harry Potter y la piedra filosofal", "0001", "J. K. Rowling", "Literatura");
        Libro harryPotterCamaraSecreta = new Libro ( "Harry Potter y la camara secreta",  "0002", "J. K. Rowling", "Literatura");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principiantes",  "0003", "Dieguito Casti", "Aprendizaje");
        Libro aprendiendoJavaE = new Libro ( "Aprendiendo Java Expertos",  "0004", "Dieguito Casti", "Aprendizaje");

        //act
        biblioteca.agegarLibro(harryPotterCamaraSecreta);
        biblioteca.agegarLibro(harryPotterPiedraFilosofal);
        biblioteca.agegarLibro(aprendiendoJavaP);
        biblioteca.agegarLibro(aprendiendoJavaE);

        //assert
        assertEquals(1,biblioteca.buscarLibroPorIsbn("0001").size());

    }
    @Test
    void buscarLibroPorCategoriaTest () {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Libro harryPotterPiedraFilosofal = new Libro ("Harry Potter y la piedra filosofal", "0001", "J. K. Rowling", "LITERATURA");
        Libro harryPotterCamaraSecreta = new Libro ( "Harry Potter y la camara secreta",  "0002", "J. K. Rowling", "LITERATURA");
        Libro aprendiendoJavaP = new Libro ("Aprendiendo Java para principiantes",  "0003", "Dieguito Casti", "APRENDIZAJE");
        Libro aprendiendoJavaE = new Libro ( "Aprendiendo Java Expertos",  "0004", "Dieguito Casti", "APRENDIZAJE");

        //act
        biblioteca.agegarLibro(harryPotterCamaraSecreta);
        biblioteca.agegarLibro(aprendiendoJavaE);

        //assert
        assertEquals(1,biblioteca.buscarLibroPorCategoria("LITERATURA").size());
        // Libro libro = (Libro) biblioteca.buscarLibroPorCategoria(LITERATURA);
        //Assertions.assertNull(libro);

    }
    //hasta aca llegue
    //4.Incorporar un estudiante o socio a la biblioteca registrando un tipo y número de documento, nombre y apellido, y domicilio.

    @Test
    void agregarSocioTest () {
        //arrange
        Biblioteca biblioteca = new Biblioteca("Nacional");
        Socio emilianoPerezAli = new Socio ("DNI", 34504576,"Emiliano","Perez Ali","Pueryrredon", 3350);
        Socio diegoBroto = new Socio("DNI", 29508130, "Diego", "Broto", "Calle 66", 6517 );

        //act
        biblioteca.agregarSocio(emilianoPerezAli);
        biblioteca.agregarSocio(diegoBroto);

        //assert
        assertEquals(2, biblioteca.getSocios().size());



    }
}
