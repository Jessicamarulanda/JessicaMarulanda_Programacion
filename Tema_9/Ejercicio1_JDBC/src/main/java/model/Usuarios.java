package model;

public class Usuarios {
    int id,telefono,sueldo,perfil;
    String nombre,apellido,pais;

    public Usuarios() {}

    public Usuarios(int id, int telefono, int sueldo, int perfil, String nombre, String apellido, String pais) {
        this.id = id;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.perfil = perfil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                ", perfil=" + perfil +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
