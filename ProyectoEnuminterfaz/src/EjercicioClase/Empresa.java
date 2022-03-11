package EjercicioClase;

import java.util.ArrayList;

public  final class Empresa
{  ArrayList <Persona> listaPersona;
   private double totalVotos;
   private String nombre;
   private double beneficios;

    public void Empresa(){}

    public Empresa(String nombre, double beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
        listaPersona = new ArrayList<>();
    }


   public void listarPersona()
   {
       for (Persona persona:listaPersona)
       {
         persona.mostrarDatos();
       }
   }
   public void agregarPersona(Persona persona)
   {
       listaPersona.add(persona);
   }

   public void despedirPersona(String dni)
   {
       for(int i= 0 ; i < listaPersona.size(); i++)
       {
           if(listaPersona.get(i).getDni().equalsIgnoreCase(dni))
           {
               listaPersona.remove(i);
               break;
           }
       }
   }
   public void buscarPersona(String dni)
   {
       for (Persona persona:listaPersona)
       {
         if (persona.getDni().equalsIgnoreCase(dni))
         {
             persona.mostrarDatos();
         }
       }
   }

   public void guardarVotos(Comision comision)
   {
       this.totalVotos += comision.votar();
   }



}
