package Tema7_anidacion;

public class Entrada {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford","fiesta",200,10.00);
        coche.mostrarDatos();
        Coche.Motor motor = coche.new Motor(25,50);
        coche.mostrarDatos();
    }
}
