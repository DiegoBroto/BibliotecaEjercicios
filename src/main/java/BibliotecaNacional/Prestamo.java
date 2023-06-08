package BibliotecaNacional;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prestamo {
    private String libroPres;
    private Integer docSocio;
    private LocalDate fecha;

    public Prestamo (String libroPres, Integer docSocio) {
        this.libroPres = libroPres;
        this.docSocio = docSocio;
        this.fecha = LocalDate.now();
    }

    public String getLibroPres() {
        return libroPres;
    }

    public Integer getDocSocio() {
        return docSocio;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
