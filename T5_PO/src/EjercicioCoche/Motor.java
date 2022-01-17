package EjercicioCoche;

public class Motor {
    private int litrosAceite;
    private int cv;

    public Motor(){

    }
    public Motor(int cv){
        this.cv= cv;
    }
    public Motor (int cv, int litrosAceite){
        this.cv = cv;
        this.litrosAceite = litrosAceite;
    }
    public int getCv() {
        return cv;
    }
    public int getLitrosAceite() {
        return litrosAceite;
    }

    public void setLitrosAceite(int litrosAceite) {
        this.litrosAceite = litrosAceite;
    }


}
