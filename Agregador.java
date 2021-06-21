import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Agregador {

    private ArrayList<Noticia> noticias;
    private ArrayList<Suscripcion> suscripciones;

    public Agregador(Noticia noticia) {
        noticias = new ArrayList<>();
        suscripciones = new ArrayList<>();
        addNoticia(noticia);
    }

    public void addNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void addSuscripcion(Suscripcion suscripcion) {
        suscripciones.add(suscripcion);
    }

    public void enviaSuscripciones() {
        for (Suscripcion suscripcion:this.suscripciones) {
            if (suscripcion.activa(Calendar.getInstance())) {
                System.out.println("Noticias enviadas a: " + suscripcion.getUsuario().getEmail());
            }
        }
    }

    public List<Noticia> noticias(Calendar inicio, Calendar fin) {
        List<Noticia> noticias = new ArrayList<Noticia>();
        inicio.add(Calendar.DATE, -1);
        fin.add(Calendar.DATE, 1);
        for (Noticia noticia:this.noticias) {
            if (noticia.getFecha().after(inicio) && noticia.getFecha().before(fin)) {
                noticias.add(noticia);
            }
        }
        return noticias;
    }

}
