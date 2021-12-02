package TratamientoPalabras;

public class TratamientoPalabras {
    public static void main (String [] args){
        String correo = "Jessicamarulanda@juanpablosegundo.es";
        String dominio = "";
        String nombre = "";
       System.out.println(correo.indexOf('@'));
       nombre = correo.substring(0,correo.indexOf('@'));
       dominio = correo.substring(correo.indexOf('@')+1,correo.length());
       System.out.println("tu nombre es:" + nombre);
       System.out.println("tu dominio es:" + dominio);

    }
}
