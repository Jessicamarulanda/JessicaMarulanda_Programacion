package EjercicioCoche;

public class Entrada {
    public static void main(String[] args) {
        Motor motorGasoil = new Motor(150, 1000);
        Motor motorGasolina = new Motor(120, 500);
        Coche cocheGasolina = new Coche("ford", "fiesta", motorGasolina);
        Coche cocheGasoil = new Coche("opel", "corsa", motorGasoil);
        Garaje garaje = new Garaje();
        System.out.println(cocheGasoil.getMotor().getCv());
        if (garaje.aceptarCoche(cocheGasoil, "Aceite")) {
            System.out.println("Coche aceptado");
            System.out.println(cocheGasoil.getMotor().getLitrosAceite());
        } else {
            System.out.println("Coche ocupado");
        }

        garaje.devolverCoche();

        if (garaje.aceptarCoche(cocheGasolina, "Aceite")) {
            System.out.println("Coche aceptado");
            System.out.println(cocheGasolina.getMotor().getLitrosAceite());
        } else {
            System.out.println("Coche ocupado");
        }
    }
}
