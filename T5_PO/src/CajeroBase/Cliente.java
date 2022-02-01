package CajeroBase;

import java.util.ArrayList;

public class Cliente {
    private String nombre,dni;
    private ArrayList listaCuentas;

    public Cliente(String nombre, String dni,int listaCuentas)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.listaCuentas = new ArrayList(listaCuentas);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(ArrayList listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

}
