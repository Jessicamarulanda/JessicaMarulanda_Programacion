import controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File file = null;
        File file2 = null;
        File directory = null;
        File directory2 = null;
        file = new File("C:/Users/Usuario DAM1/Desktop/ficheros/fichero.txt");
        file2 = new File("C:/Users/Usuario DAM1/Desktop/ficheros/fichero1.txt");
        directory = new File ("C:/Users/Usuario DAM1/Desktop/ficheros");
        directory2 = new File ("C:/Users/Usuario DAM1/Desktop/ficheros_2");

        FicherosController ficherosController = new FicherosController();
        ficherosController.getFileInfo(file);
        ficherosController.getDirectoryInfo(directory);

        /*FicherosController ficherosController1 = new FicherosController();
        ficherosController1.lecturaFichero(file);*/

        /*FicherosController ficherosController1 = new FicherosController();
        ficherosController1.lecturaBuffer(file);*/

        FicherosController ficherosController1 = new FicherosController();
        ficherosController1.escrituraFichero(file2);

    }
}
