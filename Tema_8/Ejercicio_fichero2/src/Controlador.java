import javax.swing.*;
import java.io.*;

    public class Controlador {

        public void getFileInfo(File file){
            System.out.println("Informacion de fichero");
            System.out.println("Es directorio? "+file.isDirectory());
            System.out.println("Es fichero? "+file.isFile());
            System.out.println("Existe? "+file.exists());
            System.out.println("Padre "+file.getParent());
            System.out.println("Nombre "+file.getName());
            System.out.println("Ruta Absoluta "+file.getAbsolutePath());
            System.out.println("Ruta Relativa "+file.getPath());
            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    public void escribirFicheroCompleto(File file) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("Esto es un ejemplo de linea");
            /*bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Esto es un ejemplo");
            bufferedWriter.newLine();
            bufferedWriter.write("Esto es un ejemplo de linea nueva");
            bufferedWriter.newLine();*/

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

                /*if (bufferedWriter != null) {
                    //fileWriter.close();
                    bufferedWriter.close();
                }*/
            if (printWriter != null) {
                //fileWriter.close();
                printWriter.close();
            }


        }
    }
}
