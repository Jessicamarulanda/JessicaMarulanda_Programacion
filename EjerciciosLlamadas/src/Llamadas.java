public abstract class Llamadas {
   protected int numeroOrigen,numeroDestino;
   protected double coste,duracion;

    public Llamadas(){}
    public Llamadas(int numeroDestino,int numeroOrigen,double duracion)
    {
        this.numeroDestino = numeroDestino;
        this.numeroOrigen = numeroOrigen;
        this.duracion = duracion;
        this.coste = calcularCoste();
    }


    public abstract double calcularCoste();
    public  void  mostrarDatos()
    {
        System.out.println("El número de origen es:" + numeroOrigen);
        System.out.println("El número de destino es:" + numeroDestino);
        System.out.println("La duracion:" + duracion);
        System.out.println("El coste:" + coste);
    }



    public int getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(int numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public int getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(int numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
