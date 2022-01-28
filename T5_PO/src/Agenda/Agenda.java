package Agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList <Persona> lista;
    private String nombre, dni;
    private int telefono;
    public Agenda(){
      lista = new ArrayList();
    }

    public void agregarPersona(Persona persona)
    {
      lista.add(persona);
    }


    public void borrarPersona(String dni){
    for(int i = 0; i < lista.size() ; i++ ) {
        if (dni.equalsIgnoreCase(lista.get(i).getDni()))
    {
        lista.remove(i);
         System.out.println("Persona Borradda");
    }else{
            System.out.println("Persona no Encontrada");
    }

    }
    }

    public void editarP(String dni, String nombre,int telefono){
        for(int i = 0; i < lista.size() ; i++ ) {
            if (dni.equalsIgnoreCase(lista.get(i).getDni()))
            {
                lista.get(i).setNombre(nombre);
                lista.get(i).setTelefono(telefono);
                System.out.println("Persona Editada");
            }else{
                System.out.println("Persona no Encontrada");
            }

        }

    }

    public void buscarP(String dni){
        for(int i = 0; i < lista.size() ; i++ ) {
            if (dni.equalsIgnoreCase(lista.get(i).getDni()))
            {
                System.out.println("DATOS PERSONA:");
                System.out.println("Nombre:" + lista.get(i).getNombre());
                System.out.println("DNI:" + lista.get(i).getDni());
                System.out.println("Telefono:" + lista.get(i).getTelefono());


            }else{
                System.out.println("Persona no Encontrada");
            }

        }

    }

    public void listarPer(){
        for(int i = 0; i < lista.size() ; i++ ) {

                System.out.println("DATOS PERSONA:");
                System.out.println("Nombre:" + lista.get(i).getNombre());
                System.out.println("DNI:" + lista.get(i).getDni());
                System.out.println("Telefono:" + lista.get(i).getTelefono());

        }
    }



    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}

