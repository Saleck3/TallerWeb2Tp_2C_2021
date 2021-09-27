package ar.edu.unlam.tallerweb1.modelo;

import java.util.Objects;

public class Cerveza {

    private Integer id;
    private String nombre;
    private String marca;
    private TipoCerveza tipo;

    @Override
    public String toString() {
        return "Cerveza{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cerveza cerveza = (Cerveza) o;
        return id.equals(cerveza.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoCerveza getTipo() {
        return tipo;
    }

    public void setTipo(TipoCerveza tipo) {
        this.tipo = tipo;
    }

    public Cerveza(String nombre, String marca, TipoCerveza tipo) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
    }
}
