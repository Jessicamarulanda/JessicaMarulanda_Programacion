package Bliblioteca;

import java.util.ArrayList;

public  final class Socio extends Persona {
    private int numeroSocios;
   private ArrayList <Prestar> listaPrestamo;

    public Socio() {}

    public Socio(String nombre, String apellido, String dni, int numeroSocios) {
        super(nombre, apellido, dni);
        this.numeroSocios = numeroSocios;
        listaPrestamo = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Numero de socios" + this.numeroSocios);
        System.out.println("Prestmos:");
        for (Prestar item: listaPrestamo)
        {
            ((Elemento)item).mostrarDatos();
        }
    }

    public int getNumeroSocios() {
        return numeroSocios;
    }

    public void setNumeroSocios(int numeroSocios) {
        this.numeroSocios = numeroSocios;
    }

    public ArrayList<Prestar> getListaPrestamo() {
        return listaPrestamo;
    }

    public void setListaPrestamo(ArrayList<Prestar> listaPrestamo) {
        this.listaPrestamo = listaPrestamo;
    }
}
