package EjercicioTrigonometria;

public  abstract  class Figura {
    protected double area;
    public Figura(){}

    public abstract double CalcularArea();



    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
