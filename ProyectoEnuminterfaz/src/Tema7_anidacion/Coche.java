package Tema7_anidacion;

public class Coche {
    private String marca,modelo;
    private int velocidad;
    private double precio;
    private Motor motor;

    public Coche(String marca, String modelo, int velocidad, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.precio = precio;
    }

    public void mostrarDatos()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Precio: " + this.precio);
        if(motor== null)
        {
            System.out.println("El coche no tiene motor");

        }else
        {
            motor.mostrarDatosMotor();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if(motor.cv <50)
        {
            this.precio += this.precio * 0.25;
        }else if (motor.cv >=50 && motor.cv < 100)
        {
            this.precio += this.precio * 0.40;
        }else if (motor.cv >=100 && motor.cv<200)
        {
            this.precio += this.precio * 0.60;
        }else if(motor.cv >=200)
        {
            this.precio += this.precio * 0.80;
        }
    }

    class Motor{
        private int cv,cc;

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);
        }

        public void mostrarDatosMotor()
        {
            System.out.println("Cv:" + cv);
            System.out.println("CC:" + cc);
        }
        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }
    }
}
