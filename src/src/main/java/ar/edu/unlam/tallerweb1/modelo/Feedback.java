package ar.edu.unlam.tallerweb1.modelo;

import java.util.Date;
import java.util.Objects;

public class Feedback {

    private Integer id;
    private Integer puntuacionCerveceria; //minimo 1 maximo 5
    private String comentario;
    private Date fecha;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return id.equals(feedback.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", puntuacionCerveceria=" + puntuacionCerveceria +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getPuntuacionCerveceria() {
        return puntuacionCerveceria;
    }

    public void setPuntuacionCerveceria(Integer puntuacionCerveceria) {
        this.puntuacionCerveceria = puntuacionCerveceria;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Feedback(Integer puntuacionCerveceria, String comentario, Date fecha) {
        this.puntuacionCerveceria = puntuacionCerveceria;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Feedback() {

    }
}
