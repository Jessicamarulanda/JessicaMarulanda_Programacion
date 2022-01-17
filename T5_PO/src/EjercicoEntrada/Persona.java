package EjercicoEntrada;

public class Persona {
        //variables//
        private String nombre,apellido,dni;
        private int edad, altura;
        private  double peso;

        public Persona(){
            this.nombre ="Por defecto";
            this.apellido = "Por defecto";
            this.dni = "1111111X";
        }

        public Persona(String nombre,String apellido,String dni,int edad,int altura, double peso){
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.edad = edad;
            this.altura = altura;
            this.peso = peso;
        }

    public Persona(String nombre,String apellido,String dni,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
    public Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = "1111111X";
    }

    public void incrementarEdad(int edadIncremento){
            edad += edadIncremento;
    }

    public double calcularImc(){
          double  masaCor = peso / (altura * altura);
            return masaCor;
    }

    public String estadoImc(){
            final double IMC = calcularImc() * 10000;
            String estado = "";
            if (IMC < 18.5){
                estado = "Peso es inferior al normal";
            }else if(IMC > 18.5 && IMC < 24.9) {
                estado = "Peso es normal";
        }else if ( IMC >= 25 && IMC < 29.9){
                estado = "Peso es Superior al normal";
        }else {
                estado = "Obesidad";
            }
          return estado;
    }

    public void mostrarDatos (){
            System.out.printf("Nombre: %s%n Apellido: %s%n Edad:%d", nombre,apellido,edad);
    }

    public int getAltura(int i) {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso(int i) {
        return peso;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
            this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

