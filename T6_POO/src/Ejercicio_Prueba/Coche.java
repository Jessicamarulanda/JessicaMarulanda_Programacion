package Ejercicio_Prueba;

public abstract class Coche {
    String matricula,bastidor;
    int cv,cc,velocidad;

    public Coche(){}

    public Coche(String matricula,String bastidor,int cv,int cc)
    {
        this.bastidor = bastidor;
        this.cc = cc;
        this.cv = cv;
        this.matricula = matricula;
    }

    public void calcularVelocidad(int velocidad)
    {
        this.velocidad += velocidad;
    }

    public void mostrarDatos()
    {
        System.out.println("Los datos del coche son:" +
                "Matricula:" + matricula + "Bastidor:" + bastidor + "cv:" + cv + "cc:" + "Velocidad:" + velocidad);
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
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

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
