public   class LlamadaNacional extends Llamadas{
    private int franja;

    public LlamadaNacional(){}

    public LlamadaNacional(int numeroDestino, int numeroOrigen, int duracion, int franja) {
        super(numeroDestino, numeroOrigen, duracion);
        this.franja = franja;
        calcularCoste();
    }
    @Override
    public void mostrarDatos()
    { super.mostrarDatos();
       System.out.println("la franja Nacional: " + franja);
    }

    @Override
    public double calcularCoste() {
      if(this.franja == 1)
      {
        coste = 0.20 * duracion;
        return coste;
      }else if(this.franja == 2){
          coste = 0.25 * duracion;
          return coste;
      }else if(this.franja == 3){
          coste = 0.30 * duracion;
          return coste;
      }
      return coste;
    }

    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }
}
