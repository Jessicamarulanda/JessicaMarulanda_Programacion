package CajeroBase;

import java.util.ArrayList;

public class Banco {
    private String nombre,cif;
    private ArrayList cuenta;

    public Banco(String nombre, String cif, int cuentas)
    {
        this.nombre = nombre;
        this.cif = cif;
        this.cuenta = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getCuenta() {
        return cuenta;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setCuenta(ArrayList cuenta) {
        this.cuenta = cuenta;
    }

}
