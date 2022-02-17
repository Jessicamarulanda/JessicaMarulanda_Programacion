package EjercicioTrigonometria;

public class Rectangulo  extends Figura{
    private int base,altura;
    private double perimetro;
    public Rectangulo(){}
    public Rectangulo(int base, int altura)
    {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double CalcularArea()
    {
        this.area  = base * altura;
        return this.area;
    }

}
