import java.util.Calendar;

public class Mensual implements Suscripcion {

    private int duracion;
    private int dia;
    private Usuario usuario;

    public Mensual(int duracion, int dia, Usuario usuario) {
        this.duracion = duracion;
        this.dia = dia;
        this.usuario = usuario;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public boolean activa(Calendar calendar) {
        return duracion > 0 && dia == calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void restarDuracion() {
        duracion -= 1;
    }

}
