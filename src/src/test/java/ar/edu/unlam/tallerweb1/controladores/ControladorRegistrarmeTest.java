package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class ControladorRegistrarmeTest {

    private ServicioLogin servicioLogin = mock(ServicioLogin.class);
    private ControladorRegistrarme controladorRegistrarme = new ControladorRegistrarme();
    private DatosRegistro USUARIO = new DatosRegistro("saleck@example.com", "saleck@example.com", "cosa", "cosa");
    private DatosRegistro USUARIO_MAIL_INCORRCTO = new DatosRegistro("saleck@example.com", "saleckexample.com", "cosa", "cosa");

    @Test
    public void puedoRegistrarmeConUsuarioNuevoYClaveCorrecta() {

        givenQueElUsuarioNoExiste(USUARIO);
        ModelAndView mav = whenRegistroElUsuario(USUARIO);
        thenElRegistroEsExitoso(mav);
    }

    @Test
    public void noPuedoRegistrarmeConMailDeUsuarioIncorrecto() {
        ModelAndView mav = whenRegistroElUsuario(USUARIO_MAIL_INCORRCTO);
        thenElRegistroFalla(mav);
    }

    @Test
    public void alRegistrarmeConUnUsuarioExistente(){

    }

    private void givenQueElUsuarioNoExiste(DatosRegistro usuario) {

    }

    private void givenQueElUsuarioExiste(DatosRegistro usuario) {
        doThrow(Exception.class).when(servicioLogin).registrar(anyString(), anyString());
    }

    private ModelAndView whenRegistroElUsuario(DatosRegistro datos) {
        return controladorRegistrarme.registrarUsuario(datos);
    }

    private void thenElRegistroEsExitoso(ModelAndView mav) {
        assertThat(mav.getViewName()).isEqualTo("login");
        assertThat(mav.getModel().get("msg")).isEqualTo("Registro Exitoso");
        assertThat(mav.getModel().get("email")).isEqualTo(USUARIO.getEmail());
    }

    private void thenElRegistroFalla(ModelAndView mav) {
        assertThat(mav.getModel().get("msg")).isEqualTo("Registro Fallido por mail incorrecto");
    }
}
