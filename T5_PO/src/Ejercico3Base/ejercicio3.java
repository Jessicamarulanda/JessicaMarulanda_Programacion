package Ejercico3Base;

import EjercicoEntrada.Persona;

public class ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona("Borja","Martin");
        persona.setEdad(20);
        persona.setPeso(70);
        persona.setAltura(180);
       /* persona.incrementarEdad(10);*/
        System.out.println(persona.calcularImc());
    }
}
