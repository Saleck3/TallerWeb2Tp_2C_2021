package ar.edu.unlam.tallerweb1.controladores;

import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorRegistrarme {

    private ServicioLogin servicioLogin;

    public ControladorRegistrarme(){

    }
    @Autowired
    public ControladorRegistrarme(ServicioLogin servicioLogin){
        this.servicioLogin = servicioLogin;
    }

    private boolean esValido(String email){
        return email.endsWith(".com") && email.contains("@");
    }

    //@RequestParam es para ?nombre=val&nombre2=val
    @RequestMapping(method = RequestMethod.GET, path = "/ir-a-registrarme/{nombre}")
    public ModelAndView irARegistrarme(@PathVariable("nombre") String nom){
        ModelMap model = new ModelMap();
        model.put("usuario",new DatosRegistro(nom));
        model.put("parametro-recibido",nom.toUpperCase());
        return new ModelAndView("registro-usuario",model);
    }

    public ModelAndView registrarUsuario(DatosRegistro datos) {
        ModelMap model = new ModelMap();
        String view = "login";
        if(esValido(datos.getEmail())){
            model.put("email", datos.getEmail());
            model.put("msg", "Registro Exitoso");

        }else {
            model.put("msg", "Registro Fallido por mail incorrecto");
            view = "registrarme";
        }

        return new ModelAndView(view,model);

    }

}
