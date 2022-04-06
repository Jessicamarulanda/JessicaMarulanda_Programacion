package controller;

import java.io.File;
import java.io.IOException;

public class FicherosController {

    public void getFileInfo(File file){

        System.out.println("Informacion sobre fichero");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero?" + file.isFile());

        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public void getDirectoryInfo(File file)
    {
        if(file.isDirectory())
        {
            String[] nombreFichero = file.list();
            File[] ficheros = file.listFiles();
           // System.out.println(nombreFichero);
           /* for (String item: nombreFichero) {
                System.out.println(item);
            }*/
            for (File fichero: ficheros)
            {
              System.out.println(fichero.getName());
            }
        }

    }
}
