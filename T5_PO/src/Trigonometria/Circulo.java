package Trigonometria;

public class Circulo {
    private double radio;
    double area,diametro;

    public Circulo(){
    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public void calcularArea(){
        area  = Math.PI * (2 * radio);
        System.out.println("El area del circulo es: " + area);
    }
    public  void calcularDiametro(){
        diametro = 2 * radio;
        System.out.println("El Diámetro del circulo es: " + diametro);
    }
    public void mostrasDatos(){
        System.out.println("Radio:" + radio);
        System.out.println("Área:" + area);
        System.out.println("Diámetro" + diametro);

    }
}
