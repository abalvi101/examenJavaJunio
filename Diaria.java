import java.util.Calendar;

public class Diaria implements Suscripcion {

    private Calendar caducidad;
    private Usuario usuario;

    public Diaria(Calendar caducidad, Usuario usuario) {
        this.caducidad = caducidad;
        this.usuario = usuario;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public boolean activa(Calendar calendar) {
        return calendar.after(caducidad);
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
