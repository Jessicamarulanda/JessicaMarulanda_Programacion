package Ejercicio_Prueba;

import java.util.ArrayList;

public class Concesionario {
    ArrayList<Coche> listaCoche;
    int deportivo;
    int  suv;
    int electrico;

    public Concesionario()
    {
        listaCoche = new ArrayList<>();
    }

    public void agregarCoche(Coche coche)
    { boolean encontrada = false;
        for (Coche item:listaCoche)
        { if(item.getMatricula().equalsIgnoreCase(coche.getMatricula()))
        {
            encontrada = true;
            System.out.println("coche ya existe en la lista");
            break;
        }
        }

        if(!encontrada)
        {
            listaCoche.add(coche);
            System.out.println("coche Agregado correctamente.");
        }
    }

    public void buscarCoche(Coche coche)
    {
        boolean encontrada = false;
            for (Coche item:listaCoche)
            { if(item.getMatricula().equalsIgnoreCase(coche.getMatricula()))
            {
                encontrada = true;
                System.out.println("coche encontrado");
                System.out.println("Datos:");
                item.mostrarDatos();
                break;
            }
            }

            if(!encontrada)
            {
                System.out.println("El coche no existe");
            }
        }

        public void borrarCoche(Coche coche)
        {
            boolean encontrada = false;
            for (Coche item:listaCoche)
            { if(item.getMatricula().equalsIgnoreCase(coche.getMatricula()))
            {
                encontrada = true;
                System.out.println("coche encontrado");
                listaCoche.remove(item);
                System.out.println("Coche borrado correctamente");
                break;
            }
            }

            if(!encontrada)
            {
                System.out.println("El coche no existe");
            }        }

    public void listarCoche()
    {
        for (Coche coche:listaCoche)
        {
           coche.mostrarDatos();
        }
    }

    public void clasificar()
    {
        for (Coche coche:listaCoche)
        {
            if (Deportivo.class.equals(coche.getClass())) {
                deportivo++;
            } else if (Suv.class.equals(coche.getClass())) {
                suv ++;
            } else if (Electrico.class.equals(coche.getClass())) {
                electrico++;
            }
        }

        System.out.println("LOS DEPORTIVOS SON:" + deportivo);
        System.out.println("LOS SUV SON:" + suv);
        System.out.println("LOS ELECTRICOS SON:" + electrico);

    }







}
