package EjercicioClase;

public  final class Autonomo extends Trabajador
{   private double cuota;
    private String factura;

    public Autonomo() {}

    public Autonomo(String nombre, String apellido, String dni, double sueldo, Departamento departamento, double cuota) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        realizarFactura();
    }

    @Override
    public void mostrarDatos(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super.mostrarDatos(nombre, apellido, dni, sueldo, departamento);
        System.out.println("Cuota" + cuota);
        System.out.println("Factura" + factura);
    }

    public void realizarFactura(){
        this.factura = String.format("Factura realizada por un importe de %.2f a la empresa con CIF %S" , this.sueldo,Admin.CIF);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (cuota + (cuota*Admin.IVA)) - (this.sueldo*Admin.IRPF);
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
