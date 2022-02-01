package Carrera;

public class Entrada {
    public static void main(String[] args) {
    Coche cocheA = new Coche();
    Coche cocheB = new Coche("mercees","154987654j",25);
    cocheA.mostrarDatos();
    cocheB.mostrarDatos();
    cocheA.setCaballos(65);
    cocheA.setModelo("Audi");
    cocheA.setMatricula("86567d");

    System.out.println("Modificación de velodad");
    cocheA.setVelocidad((int)(Math.random()*20) + 10);
    cocheB.setVelocidad((int)(Math.random()*20) + 10);
        cocheA.mostrarDatos();
        cocheB.mostrarDatos();
        cocheA.acelerar(90);
        cocheB.acelerar(60);
        cocheA.frenar(20);
        cocheB.frenar(30);
        if (cocheA.getKilometrsReco() > cocheB.getKilometrsReco()){
            System.out.println("El coche ganor con Modelo:" + cocheA.getModelo());
            System.out.println(" Matricula:" + cocheA.getMatricula());
            System.out.println(" Kilometros:" + cocheA.getKilometrsReco());
        }else {
            System.out.println("El coche ganor con Modelo:" + cocheB.getModelo());
            System.out.println("Matricula:" + cocheB.getMatricula());
            System.out.println(" Kilometros:" + cocheB.getKilometrsReco());
        }
    }
}
