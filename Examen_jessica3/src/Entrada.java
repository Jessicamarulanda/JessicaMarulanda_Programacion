import java.util.InputMismatchException;

public class Entrada {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Tienda.Alcamecen almacen = tienda.new Alcamecen(8);
        Bicicleta bici = new Bicicleta(Tipo.mtb, 150, 28, Tamanio.M) {
            @Override
            public int reparar() {
                return 0;
            }
        };
        Bicicleta bici2 = new Bicicleta(Tipo.carretera, 100, 30, Tamanio.L) {
            @Override
            public int reparar() {
                return 0;
            }
        };
        Bicicleta bici3 = new Bicicleta(Tipo.carretera, 250, 35, Tamanio.S) {
            @Override
            public int reparar() {
                return 0;
            }
        };
        Bicicleta bici4 = new Bicicleta(Tipo.paseo, 180, 98, Tamanio.M) {
            @Override
            public int reparar() {
                return 0;
            }
        };

        tienda.agregarBici(bici);
        tienda.agregarBici(bici2);
        tienda.agregarBici(bici3);
        tienda.agregarBici(bici4);


        Bicicleta bici5 = new Bicicleta(Tipo.mtb, 27, 29, Tamanio.L) {
            @Override
            public int reparar() {
                this.setEstado(true);
                this.setVelocidades(this.velocidades + 2);
                tienda.setCaja((tienda.getCaja()) + (int) (Math.random() * 100) + 100);
                return tienda.getCaja();
            }
        };
        tienda.repararBici(bici5);
        tienda.setCaja(tienda.getCaja()+ bici5.reparar());

        Bicicleta bici6 = new Bicicleta(Tipo.paseo, 2, 27, Tamanio.M) {
            @Override
            public int reparar() {
                this.setEstado(true);
                this.setVelocidades(this.velocidades + 1);
                this.setPulgadas(this.pulgadas + 2);
                tienda.setCaja((tienda.getCaja()) + (int) (Math.random() * 50) + 50);
                return tienda.getCaja();
            }
        };
        tienda.repararBici(bici6);
        tienda.setCaja(tienda.getCaja()+ bici6.reparar());


        Bicicleta bici7 = new Bicicleta(Tipo.carretera, 8, 24, Tamanio.S) {
            @Override
            public int reparar() {
                this.setEstado(true);
                this.setVelocidades(this.velocidades + 4);
                this.setPulgadas(this.pulgadas + 5);
                tienda.setCaja((tienda.getCaja()) + (int) (Math.random() * 150) + 100);
                return tienda.getCaja();
            }
        };


        tienda.datosBiciStock();
        tienda.bicisReparadas();

        int numero = (int) (Math.random() * 20) + 1;
        try{
            if(tienda.getBicicletasReparar().size() < numero)
            {
                throw new Excepcion("la bicicleta no existe: ");
            }

        } catch (InputMismatchException | Excepcion e)
        {
            System.out.println(e.getMessage());
        }
        tienda.venderBicicletas(numero);
        System.out.println("Valor total de la caja " + tienda.getCaja());
    }
}
