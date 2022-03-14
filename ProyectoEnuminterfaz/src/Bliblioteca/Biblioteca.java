package Bliblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList <Persona> listaPersonas;
    ArrayList <Elemento> listaElemento;

    public Biblioteca()
    {
        listaElemento = new ArrayList<>();
        listaPersonas = new ArrayList<>();
    }

    public void registrarPersona(Persona persona)
    {
        listaPersonas.add(persona);
    }

    public void registrarElemento(Elemento elemento){
        listaElemento.add(elemento);
    }

    public void realizarPrestamo(Socio socio,Prestar elemento)
    {
       if( ((Elemento)elemento).getEstado() == false)
       {
           socio.getListaPrestamo().add(elemento);
           ((Elemento)elemento).setEstado(true);
           System.out.println("Se a añadido a su lista de prestamo");
       }else
       {
           System.out.println("El elemento ya esta prestado");
       }
    }

    public void    DevolverPrestamo(Socio socio,Prestar elemento)
    {
        for (int i = 0; i< socio.getListaPrestamo().size(); i++){
          if (((Elemento)socio.getListaPrestamo().get(i)).getEstado()){
                socio.getListaPrestamo().remove(elemento);
                ((Elemento) elemento).setEstado(false);
                break;
            }
        }
    }

    public void mostrarDisponible()
    {
        for (Elemento item:listaElemento)
        { if(item instanceof Prestar)
        { if(item.getEstado())
          {
              item.mostrarDatos();
          }

        }

        }
    }

    public void mostrarElementoSocio(String dni)
    {
        for (Persona item: listaPersonas)
        {
          if(item instanceof Socio)
          {
              if(item.getDni().equalsIgnoreCase(dni))
              {
                  for (Prestar prestar: ((Socio) item).getListaPrestamo())
                  {
                      ((Elemento)prestar).mostrarDatos();
                  }
              }
          }
        }
    }


}
