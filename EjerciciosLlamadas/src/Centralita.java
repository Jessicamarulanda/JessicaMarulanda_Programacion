import java.util.ArrayList;

public class Centralita {
   private  ArrayList<Llamadas> listaLlamadas;
    private double costeTotal;
    public Centralita ()
    {
        listaLlamadas = new ArrayList<>();
    }
    public void agragarLlamada(Llamadas llamada)
    {
        listaLlamadas.add(llamada);
       llamada.mostrarDatos();
    }

    public void costeTotal()
    {
        for (Llamadas llamada:listaLlamadas)
        {
            costeTotal += llamada.getCoste();
        }

        System.out.println("El coste totl es: " + costeTotal);
    }

    public void llamadasRealizadas()
    {
        for (Llamadas llamadas: listaLlamadas)
        {   System.out.println(llamadas.getClass().getSimpleName());
            if(llamadas instanceof LlamadaNacional) {
                ((LlamadaNacional)llamadas).mostrarDatos();
            }

            llamadas.mostrarDatos();
        }
    }

    public ArrayList<Llamadas> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamadas> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }
}
