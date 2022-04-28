package controller;
import model.Usuario;

import java.io.*;

public class Binarioc {

    public void agregarUsurio() {
        File file = new File("src/resources/objetos1.bin");

        // CERRARLO!!!!
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(new Usuario());
            oos.writeObject(new Usuario());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // ABSOLUTA --> DESDE LA RAIZ "/User/borja/Desktop/ficheros/fichero.obj"
        // RELATIVA --> DESDE DONDE ESTOY UBICADO "../resoruces/fichero.obj"


    }

    public void lecturaBiniario() {
        File file = new File("src/resources/objetos1.bin");

        // CERRARLO!!!!
        ObjectInputStream ois = null;
        Usuario usuario = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            while ((usuario = (Usuario) ois.readObject()) != null) {
                System.out.println(usuario.toString());
            }
        } catch (EOFException | FileNotFoundException e) {
            System.out.println("Fichero Terminado");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally
        {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
