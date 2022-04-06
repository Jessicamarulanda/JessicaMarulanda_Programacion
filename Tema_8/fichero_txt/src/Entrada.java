import controller.FicherosController;

import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("C:/Users/Usuario DAM1/Desktop/ficheros/fichero.txt");
        directory = new File ("C:/Users/Usuario DAM1/Desktop/ficheros");
        directory2 = new File ("C:/Users/Usuario DAM1/Desktop/ficheros_2");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.getFileInfo(file);
        ficherosController.getDirectoryInfo(directory);

    }
}
