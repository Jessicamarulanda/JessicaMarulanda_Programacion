package Pizza;

import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private  int id;
    private ArrayList<Ingrediente> listaIngredientes;
    private boolean estado;

    public Pizza(int id, String nombre)
    {
        this.id = id;
        this.nombre = nombre;
    }

    public Pizza(int id,String nombre,ArrayList listaIngredientes)
    {
        this.id = id;
        this.nombre = nombre;
    }

}
