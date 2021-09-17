package ar.edu.unlam.tallerweb1.controladores;

public class DatosRegistro {

    private String usuario;
    private String email;
    private String clave;
    private String repiteClave;

    public DatosRegistro(String usuario, String email, String clave, String repiteClave) {
        this.usuario = usuario;
        this.clave = clave;
        this.email = email;
        this.repiteClave = repiteClave;
    }

    public DatosRegistro(String usuario) {

        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRepiteClave() {
        return repiteClave;
    }

    public void setRepiteClave(String repiteClave) {
        this.repiteClave = repiteClave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
