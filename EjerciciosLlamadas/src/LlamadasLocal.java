public class LlamadasLocal extends Llamadas {
    final  double valor = 0.0;

    @Override
    public double calcularCoste() {
        coste = valor * duracion;
        return coste;
    }



}
