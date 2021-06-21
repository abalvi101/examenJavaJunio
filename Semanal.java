import java.util.Calendar;

public class Semanal implements Suscripcion {

    private Calendar caducidad;
    private int dia;
    private Usuario usuario;

    public Semanal(Calendar caducidad, int dia, Usuario usuario) {
        this.caducidad = caducidad;
        this.dia = dia;
        this.usuario = usuario;
    }

    public Calendar getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Calendar caducidad) {
        this.caducidad = caducidad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar calendar) {
        return calendar.after(caducidad) && dia == calendar.get(Calendar.DAY_OF_WEEK);
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
