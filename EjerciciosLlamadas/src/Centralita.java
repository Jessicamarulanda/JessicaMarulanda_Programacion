import java.util.ArrayList;

public class Centralita {
    ArrayList<Llamadas> listaLlamadas;
    int costeTotal;
    public Centralita ()
    {
        listaLlamadas = new ArrayList<>();
    }
    public void agragarLlamada(Llamadas llamada)
    {
        listaLlamadas.add(llamada);
        System.out.println("Llamada guardada correctamente con los datos:");
        System.out.println("Número origen:" + llamada.getNumeroOrigen() );
        System.out.println("Número Destino:" + llamada.getNumeroDestino());
        System.out.println("Duración:" + llamada.getDuracion());
        System.out.println("Coste" + llamada.getCoste());
    }

    public double costeTotal()
    {
        for (Llamadas llamada:listaLlamadas)
        {
            costeTotal += llamada.getCoste();
        }

        return costeTotal;
    }

    public void llamadasRealizadas()
    {
        for (Llamadas llamadas: listaLlamadas)
        {

        }
    }

    public ArrayList<Llamadas> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamadas> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }
}
