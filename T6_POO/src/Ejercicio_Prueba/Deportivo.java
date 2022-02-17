package Ejercicio_Prueba;

public class Deportivo  extends Coche
{
  private int par;
  public Deportivo() {}

    public Deportivo(String matricula,String bastidor,int cv,int cc,int par)
    { super(matricula,bastidor,cv,cc);
        this.par = par;
    }

    @Override
    public void calcularVelocidad(int velocidad)
    {
      super.calcularVelocidad(velocidad);
      this.velocidad = velocidad + (int)(Math.random()*11)+30;
    }

     @Override
     public void mostrarDatos()
     { super.mostrarDatos();
       System.out.println("Par:"+ par);
     }

  public int getPar() {
    return par;
  }

  public void setPar(int par) {
    this.par = par;
  }
}
