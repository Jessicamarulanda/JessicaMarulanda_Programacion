public class Usuario {
    //variables//
    private String correoElectronico,nombre,apellido,password,fecha;
    private int edad;

    //constructores
    // si no hay constructores escritos , por defecto toma el vacio, si quieres que cambie creas uno

    public Usuario(){
    }
    public Usuario (String nombre,String correoElectronico,String password){
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;
    }
    public Usuario (String correoElectronico,String password,int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }
    //geters
    public String getPassword (){
        return password;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getNombre(){
        return nombre;
    }
    public  String getApellido (){
        return apellido;
    }
    public String getFecha (){
        return fecha;
    }

    public int getEdad() {
        return edad;
    }

    //setters
    public void setPassword(String password){
        this.password = password;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
