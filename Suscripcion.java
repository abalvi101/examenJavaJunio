import java.util.Calendar;

public interface Suscripcion {

    public boolean activa(Calendar calendar);
    public Usuario getUsuario();
    public void setUsuario(Usuario usuario);

}
