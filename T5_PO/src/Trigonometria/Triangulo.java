package Trigonometria;

public class Triangulo {
    //variables//
    private int base, altura;
    double area;

    public Triangulo(){

    }
    public Triangulo (int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    public void calcularArea (){
        area = (base * altura) / 2;
        System.out.println("El área del triangulo es: " + area);
    }
    public void mostrasDatos(){
        System.out.println("Base:" + base);
        System.out.println("Altura:" + altura);

    }



   public int getAltura() {
       return altura;
   }

    public int getBase() {
        return base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
