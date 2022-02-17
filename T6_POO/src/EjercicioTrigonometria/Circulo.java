package EjercicioTrigonometria;

public class Circulo extends Figura {
    private double radio;
    private double diametro;
    public Circulo(){}

    public Circulo(double radio)
    {
        this.radio = radio;
    }

    @Override

    public double CalcularArea()
    {
        this.area = (Math.PI * (radio * 2));
        return this.area;
    }

    public double calcularDiametro()
    {
        diametro = radio * 2;
        return diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
