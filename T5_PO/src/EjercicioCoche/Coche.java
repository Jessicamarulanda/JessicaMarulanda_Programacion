package EjercicioCoche;

public class Coche {
    private Motor motor = new Motor(201);
    private String marca , modelo;
    private double precioAcomulado;
    public Coche(){

    }
    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
     }

     public Coche(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
     }

     public void acumularAveria (double precioAcomulado){
        this.precioAcomulado += precioAcomulado;
     }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAcomulado() {
        return precioAcomulado;
    }
}
