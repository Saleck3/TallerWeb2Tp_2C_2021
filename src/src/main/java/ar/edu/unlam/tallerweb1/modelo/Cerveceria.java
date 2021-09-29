package ar.edu.unlam.tallerweb1.modelo;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cerveceria {
    private Integer id;
    private String nombre;
    private String direccion;
    private Set<Cerveza> cervezas;
    private List<Feedback> feedbacks;

    @Override
    public String toString() {
        return "Cerveceria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cervezas=" + cervezas +
                ", feedbacks=" + feedbacks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cerveceria that = (Cerveceria) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Cerveza> getCervezas() {
        return cervezas;
    }

    public void setCervezas(Set<Cerveza> cervezas) {
        this.cervezas = cervezas;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Cerveceria(){

    }
    public Cerveceria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
