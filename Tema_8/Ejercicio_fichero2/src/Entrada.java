import controller.Controlador;

import java.io.File;

public class Entrada {

    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("/Users/borjam/Desktop/ficheros/fichero.txt");
        File file2 = new File("/Users/borjam/Desktop/ficheros/ficheroEscritura.txt");
        File file3 = new File("/Users/borjam/Desktop/ficheros/ficheroEscrituraCompleto.txt");
        directory = new File("/Users/borjam/Desktop/ficheros");
        directory2 = new File("/Users/borjam/Desktop/ficheros_nuevo");

        Controlador ficherosController = new Controlador();
        //ficherosController.getFileInfo(file);
        //ficherosController.getDirectoryInfo(directory2);
        //ficherosController.lecturaFichero(file);
        //ficherosController.lecturaBuffer(file);
        //ficherosController.escrituraFichero(file2);
        ficherosController.escribirFicheroCompleto(file3);