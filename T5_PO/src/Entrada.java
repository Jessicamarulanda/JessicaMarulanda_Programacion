public class Entrada {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("Jessica","Jessicamarulanda@gmail.com","12456789G");
        Usuario usuario3 = new Usuario("Jessicamarulanda@gmail.com","Jessica",25);


       /* System.out.println(usuario1.password);
        usuario1.password = "contraseña";
        System.out.println(usuario1.password);*/
        usuario1.setPassword("contraseña");
        usuario1.setApellido("marulanda");
        usuario1.setEdad(25);
        usuario1.setFecha("20/11/1998");
        usuario1.setNombre("Jessica");
        usuario1.setCorreoElectronico("Jessicamarulanda@gmail.com");
        System.out.println(usuario1.getPassword());
        System.out.println(usuario1.getApellido());
        System.out.println(usuario1.getNombre());
        System.out.println(usuario1.getCorreoElectronico());
        System.out.println(usuario1.getEdad());
        System.out.println(usuario1.getFecha());
    }
}
