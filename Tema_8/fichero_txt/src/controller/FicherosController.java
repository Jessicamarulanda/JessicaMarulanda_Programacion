package controller;

import java.io.*;

public class FicherosController {
    String cadena = null;
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
    public void getDirectoryInfo(File file) {
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
    public void lecturaFichero(File file) {
        FileReader fileReader = null;

        try {
            int lectura = 0;
            fileReader = new FileReader(file);
           /* while(lectura != -1)
            {
                lectura = fileReader.read();
                System.out.println(lectura);
            }*/

            while((lectura=fileReader.read()) != -1)
            {
                System.out.println((char)lectura);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void lecturaBuffer(File file){

        BufferedReader bufferedReader = null;
        String linea;
        String lecturaCompleta = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            while((linea= bufferedReader.readLine()) != null)
            {
                System.out.println(linea);
                lecturaCompleta +=linea;
                lecturaCompleta += "\n";
            }
            System.out.println("La lectura completa es: ");
            System.out.println(lecturaCompleta);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void escrituraFichero (File file,String cadena)
    {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            char letra;
            int cifrado;
            String lineaEscribir = cadena;
            fileWriter.write(lineaEscribir);
        }catch(IOException e)
        {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}

