package ar.edu.unlam.tallerweb1.modelos;

import ar.edu.unlam.tallerweb1.modelo.*;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ModelosEntidadesTest {

    @Test
    public void queSePuedaCrearUnaCerveceria(){
        Cerveceria cer = whenCreoUnaCerveceria("panch8","CervezA");
        thenSeCreaUnaCerveceria(cer);
    }

    @Test
    public void queSePuedaCrearUnaCerveza(){
        Cerveza cer = whenCreoUnaCerveza("Clasica", "quilmes",TipoCerveza.RUBIA);
        thenSeCreaUnaCerveza(cer);
    }

    @Test
    public void queSePuedaCrearUnFeedback(){
        Feedback feed = whenCreoUnFeedback();
        thenSeCreaUnFeedback(feed);
    }



    private void thenSeCreaUnFeedback(Feedback feed) {
        assertThat(feed).isNotNull();
    }

    private Feedback whenCreoUnFeedback() {
        return new Feedback();
    }

    private void thenSeCreaUnaCerveza(Cerveza cer) {
        assertThat(cer).isNotNull();
    }

    private Cerveza whenCreoUnaCerveza(String nombre, String marca,TipoCerveza tipo) {
        return new Cerveza(nombre,marca,tipo);
    }

    private void thenSeCreaUnaCerveceria(Cerveceria cer) {
        //assertThat(mav.getViewName()).isEqualTo("login");
        assertThat(cer).isNotNull();
    }

    private Cerveceria whenCreoUnaCerveceria(String nombre, String direccion) {
        return new Cerveceria(nombre, direccion);
    }
}
