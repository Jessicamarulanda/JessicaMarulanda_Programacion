package EjercicioCoche;

public class Garaje {
    private Coche coche;
    private String averiaAsociada;
    int cocheAtendiendo;
    public Garaje (){

    }
 
     public boolean aceptarCoche (Coche coche, String averiaAsociada){
        if (this.coche != null){
            return  false;
        }else{
            cocheAtendiendo ++;
            this.coche = coche;
            if (averiaAsociada.equalsIgnoreCase("aceite")){
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+10);
            }
            return true;
        }
     }
    public void devolverCoche(){
        this.coche = null;
    }



}
