package Trigonometria;

public class Cuadrado {
    private int base,altura;
    private double area,perimetro;
public Cuadrado (){

}
public Cuadrado(int base, int altura){
    this.altura = altura;
    this.base = base;
}

public double calcularAera(){
    area = base*altura;
    return  area;
}
public double perimetroCua(){
    perimetro = (2 *base) + (2 * altura);
    return perimetro;
}
    public void mostrasDatos(){
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);
        System.out.println("Peímetro:" + perimetro);
        System.out.println("Area" + area);
    }

    public int getAltura() {
        return altura;
    }
    public double getArea() {
        return area;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
