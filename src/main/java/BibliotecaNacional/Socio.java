package BibliotecaNacional;

public class Socio {

    private String tipoDoc;
    private Integer nroDoc;
    private String nombre;
    private String apellido;
    private String nombreCalle;
    private Integer nroCalle;

    public Socio(String tipoDoc, Integer nroDoc, String nombre, String apellido, String nombreCalle, Integer nroCalle) {
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCalle = nombreCalle;
        this.nroCalle = nroCalle;
    }

    public Integer getNroDoc() {
        return nroDoc;
    }

}
