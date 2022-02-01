package CajeroBase;

public class Cuenta {
    private int pin;
    private double saldo;
    private String id;
    private int numeroCuenta;
    private  Cliente cliente;
    public Cuenta (String id, int pin,double saldo,Cliente cliente){
        this.id = id;
        this.pin = pin;
        this.saldo =saldo;
        this.cliente = cliente;
    }

    public void ingreso(String id , int pin, double saldo)
    {
        this.saldo += saldo;

    }

    public void retiro(String dni , int pin, double saldo)
    {
        this.saldo -= saldo;
    }

    public void Datos(String dni , int pin)
    {
        System.out.println("el dni del titular es");
        System.out.println("el saldo es");
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getPin() {
        return pin;
    }

    public String getId() {
        return id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
