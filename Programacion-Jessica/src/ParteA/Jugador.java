package ParteA;

import java.util.ArrayList;

public class Jugador {
    private String nombre, dni;
    int dinero;
   ArrayList<Carton> cartones;

   public Jugador(String nombre,String dni,int dinero)
   {
       this.nombre = nombre;
       this.dni = dni;
       this.dinero = dinero;
       cartones = new ArrayList<>();

   }

   public void comprarCart(int cantidad)
   {

       for(int i = 0; i< cantidad; i++){
           Carton carton = new Carton();
           cartones.add(carton);
       }
   }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public int getDinero() {
        return dinero;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        this.cartones = cartones;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}

