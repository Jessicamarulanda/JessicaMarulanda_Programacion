public class Entrada {
    public static void main(String[] args) {
        Coleccion<Disco> coleccionDisco = new Coleccion();
        coleccionDisco.agregarCosas(new Disco());
        Coleccion<Coche> coleccionCoche = new Coleccion();
        coleccionCoche.agregarCosas(new Coche());
        Coleccion<Camiseta> coleccionCamiseta = new Coleccion();
        coleccionCamiseta.agregarCosas(new Camiseta());
        Coleccion<Partido> coleccionPartido = new Coleccion();
        coleccionPartido.agregarCosas(new Partido());
        Coleccion<Coleccionable> cosasColeccionable = new Coleccion<>();
        cosasColeccionable.agregarCosas(new Camiseta());
        cosasColeccionable.agregarCosas(new Disco());

        ColeccionEspecifica<Disco,Double,Boolean> listaEspecificaDisco = new ColeccionEspecifica();
        ColeccionEspecifica<Camiseta,Character,String> listaEspecificaCamiseta = new ColeccionEspecifica();



    }
}
