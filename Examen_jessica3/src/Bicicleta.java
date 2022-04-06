public abstract class Bicicleta {
    protected  Enum tipo;
    protected  int velocidades, pulgadas,coste;
    protected Enum tamanio ;
    protected  boolean  estado;

    public Bicicleta(Enum tipo,int velocidades, int pulgadas, Enum tamanio) {
        this.tipo = tipo;
        this.velocidades = velocidades;
        this.pulgadas = pulgadas;
        tamanio = tamanio;
        this.estado = estado;

    }

    public void mostrarDatos()
    {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("velocidades: " + this.velocidades);
        System.out.println("pulgadas: " + this.pulgadas);
        System.out.println("tamanio: " + this.tamanio);
        System.out.println("Estado: " + this.estado);
    }

    public abstract int reparar();

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Enum getTamanio() {
        return tamanio;
    }

    public void setTamanio(Enum tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
