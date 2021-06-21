import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestAgregador {
    Agregador agregador;
    Usuario usu1;
    Usuario usu2;
    Usuario usu3;
    Calendar dos_semanas;
    Calendar tres_dias;
    Mensual mensual;
    Semanal semanal;
    Diaria diaria;
    Noticia noticia1;
    Enlace noticia2;
    Video noticia3;
    Calendar hace_cuatro_dias;
    Calendar hace_mes_medio;
    Calendar hace_anio_medio;

    @BeforeEach
    public void inicializaTest() {
        usu1 = new Usuario("Alberto", "noSeQueEsEsto", "albertitoVasilon@gmail.com");
        usu2 = new Usuario("Javier", "noSeQueEsEsto", "abrahamesmialumnofavorito@gmail.com");
        usu3 = new Usuario("Abraham", "noSeQueEsEsto", "javimevaaponerel10@gmail.com");

        dos_semanas = Calendar.getInstance();
        dos_semanas.add(Calendar.DATE, 14);
        tres_dias = Calendar.getInstance();
        tres_dias.add(Calendar.DATE, 3);

        mensual = new Mensual(1, 21, usu1);
        semanal = new Semanal(dos_semanas, 21, usu2);
        diaria = new Diaria(tres_dias, usu3);

        Calendar hace_tres_dias = Calendar.getInstance();
        hace_tres_dias.add(Calendar.DATE, -3);
        Calendar hace_un_mes = Calendar.getInstance();
        hace_un_mes.add(Calendar.DATE, -31);
        Calendar hace_un_anio = Calendar.getInstance();
        hace_un_anio.add(Calendar.DATE, -365);
        hace_cuatro_dias = Calendar.getInstance();
        hace_tres_dias.add(Calendar.DATE, -4);
        hace_mes_medio = Calendar.getInstance();
        hace_mes_medio.add(Calendar.DATE, -40);
        hace_anio_medio = Calendar.getInstance();
        hace_anio_medio.add(Calendar.DATE, -400);

        noticia1 = new Noticia(hace_tres_dias, "Javi pone el 10 por primera vez a un alumno en Java. Se trata de" +
                "Abraham Álvarez Villa.");
        noticia2 = new Enlace(hace_un_mes, "Se publica el examen del extraordinario alumno del I.E.S. Rafael" +
                " Alberti, Abraham Álvarez.", "github.com");
        noticia3 = new Video(hace_un_anio, "Video de la entrega de notas de inigualable alumno del Rafael Alberti",
                237423921L);

        agregador = new Agregador(noticia1);
        agregador.addNoticia(noticia2);
        agregador.addNoticia(noticia3);
        agregador.addSuscripcion(diaria);
        agregador.addSuscripcion(semanal);
        agregador.addSuscripcion(mensual);
    }

    @Test
    public void testNoticias() {
        List<Noticia> resultado = agregador.noticias(hace_cuatro_dias, Calendar.getInstance());
        List<Noticia> esperado = new ArrayList<Noticia>();
        esperado.add(noticia1);
        assert resultado == esperado;
    }

    @Test
    public void testNoticias2() {
        List<Noticia> resultado = agregador.noticias(hace_mes_medio, Calendar.getInstance());
        List<Noticia> esperado = new ArrayList<Noticia>();
        esperado.add(noticia1);
        esperado.add(noticia2);
        assert resultado == esperado;
    }

    @Test
    public void testNoticias3() {
        List<Noticia> resultado = agregador.noticias(hace_anio_medio, Calendar.getInstance());
        List<Noticia> esperado = new ArrayList<Noticia>();
        esperado.add(noticia1);
        esperado.add(noticia2);
        esperado.add(noticia3);
        assert resultado == esperado;
    }

    @Test
    public void testEnviaSuscripciones() {
        /* Te lo imaginas */
        assert true;
    }

}
