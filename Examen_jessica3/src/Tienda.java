import java.util.ArrayList;
import java.util.InputMismatchException;

public final  class Tienda {
    private Alcamecen almacen;
    private ArrayList<Bicicleta> bicicletasStock;
    private  ArrayList <Bicicleta> bicicletasReparar;
    private int caja;

    public Tienda(){
        bicicletasReparar = new ArrayList<>();
        bicicletasStock = new ArrayList<>();
        this.caja = 0;
    }

    public void construirAlmacen(int numeroPlaza)
    {

    }

    public void venderBicicletas(int posicion)
    {
        if(bicicletasStock.size() > posicion) {
            System.out.println("Datos de la bici: ");
            bicicletasStock.get(posicion).mostrarDatos();
            System.out.println("Bici borrada: ");
            bicicletasStock.remove(posicion);
            this.caja += 36;
        }
    }

    public void agregarBici(Bicicleta bici)
    {
      bicicletasStock.add(bici);
    }

    public void repararBici(Bicicleta bici)
    {
        bicicletasReparar.add(bici);
    }

    public void datosBiciStock()
    {
        for (Bicicleta bici:bicicletasStock)
        {
           bici.mostrarDatos();
        }
    }

    public void bicisReparadas()
    {
       for (int i = 0; i > bicicletasReparar.size(); i++)
       {
           bicicletasReparar.get(i).setEstado(false);
           bicicletasReparar.get(i).mostrarDatos();
       }
    }

    public Alcamecen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Alcamecen almacen) {
        this.almacen = almacen;
    }

    public ArrayList<Bicicleta> getBicicletasStock() {
        return bicicletasStock;
    }

    public void setBicicletasStock(ArrayList<Bicicleta> bicicletasStock) {
        this.bicicletasStock = bicicletasStock;
    }

    public ArrayList<Bicicleta> getBicicletasReparar() {
        return bicicletasReparar;
    }

    public void setBicicletasReparar(ArrayList<Bicicleta> bicicletasReparar) {
        this.bicicletasReparar = bicicletasReparar;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    class Alcamecen
    {  private int numeroPlazas;
      public  Alcamecen (){}
        public Alcamecen(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
            construirAlmacen(numeroPlazas);
        }

        public int getNumeroPlazas() {
            return numeroPlazas;
        }

        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }
    }
}
