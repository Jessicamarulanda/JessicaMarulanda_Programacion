public class LlamadasLocal extends Llamadas {
    final  double valor = 0.0;

    public LlamadasLocal() {
    }

    public LlamadasLocal(int numeroDestino, int numeroOrigen, int duracion) {
        super(numeroDestino, numeroOrigen, duracion);
    }

    @Override
    public double calcularCoste() {
        coste = valor * duracion;
        return coste;
    }



}
