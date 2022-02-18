public  class LlamadasProvidencia extends Llamadas
{
    final double valor = 0.15;

    public LlamadasProvidencia() {
    }

    public LlamadasProvidencia(int numeroDestino, int numeroOrigen, int duracion) {
        super(numeroDestino, numeroOrigen, duracion);
    }

    @Override
    public double calcularCoste() {
        coste = valor * duracion;
        return coste;
    }
}
