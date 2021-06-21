import java.util.Calendar;

public class Noticia {

    private Calendar fecha;
    private String texto;

    public Noticia(Calendar fecha, String texto) {
        this.fecha = fecha;
        this.texto = texto;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String publica() {
        return "Noticia: " + texto;
    }
}
