package ParteA;

import java.util.ArrayList;

public class Carton {
    private  int identificador;
    private final int precio = 1;
    private int  numeroGenerados ;
    private ArrayList numeros;

    public Carton  ()
    {
        this.identificador = (int) (Math.random() *10) + 1;
        rellenar();
    }

    public void rellenar()
    {

       for (int i = 0; i<10; i++){
           numeroGenerados = (int)(Math.random()*99)+1;
           numeros.add(numeroGenerados);
       }
    }

    public ArrayList getNumeros() {
        return numeros;
    }

    public int getIdentificador(int i) {
        return identificador;
    }



    public int getPrecio() {
        return precio;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNumeros(ArrayList numeros) {
        this.numeros = numeros;
    }

}
