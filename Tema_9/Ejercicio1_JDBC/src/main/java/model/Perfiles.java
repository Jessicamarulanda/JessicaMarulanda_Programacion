package model;

public class Perfiles {
    int id;
    String nombre;

    public Perfiles(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perfiles{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
