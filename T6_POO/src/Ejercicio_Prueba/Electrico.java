package Ejercicio_Prueba;

public class Electrico  extends Coche{
     private int bateria;

    public Electrico() {
    }

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria) {
        super(matricula, bastidor, cv, cc);
        this.bateria = bateria;
    }
 @Override
    public void calcularVelocidad(int velocidad)
    {
        super.calcularVelocidad(velocidad);
        this.velocidad = velocidad + (int)(Math.random()*11)+20;
    }
    @Override
    public void mostrarDatos()
    { super.mostrarDatos();
        System.out.println("Bateria:"+ bateria);
    }


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
