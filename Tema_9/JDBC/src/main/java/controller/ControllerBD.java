package controller;

import database.ShemaBB;
import model.Alumno;

import java.sql.*;
import java.util.ArrayList;

public class ControllerBD {

    private  Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;
    private  void getConnection() {
        String host = "127.0.0.1:3306";
        String dtbs = "colegio";
        String user = "root";
        String pass = "admin";
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertarAlumno(Alumno alumno) {
        //INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Tatiana', 'Quintero', 19)
        try {
            getConnection();
            statement = conn.createStatement();
            int numero =statement.executeUpdate(String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s', '%s', %d)",ShemaBB.TAB_ALU,ShemaBB.COL_NOMBRE,ShemaBB.COL_APELLIDO,ShemaBB.COL_EDAD,alumno.getNombre(),alumno.getApellido(),alumno.getEdad()));
            System.out.println(numero);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }
    public void modificarAlumno(String nombre,int edadnueva){
        getConnection();
        try {
            statement = conn.createStatement();
            int numero = statement.executeUpdate(String.format("UPDATE %s SET %s = %d WHERE %s = '%s'",ShemaBB.TAB_ALU,ShemaBB.COL_EDAD,edadnueva,ShemaBB.COL_NOMBRE,nombre));
            if(numero > 0){
                System.out.printf("Se actualizado %d usuarios", numero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }


    }
    public void borrarAlumno(int edad) {
        String query = String.format("DELETE FROM %s WHERE %s < ?");
        getConnection();

        try {
            preparedStatement = conn.prepareStatement(String.format(query,ShemaBB.TAB_ALU,
                    ShemaBB.COL_EDAD));
            preparedStatement.setInt(1,edad);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Los borrar afectados son "+rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void procesarArrary(ArrayList lista)
    {
        System.out.println(lista.size());
    }
    public void getResultado(){
        ArrayList<Alumno> listaAlumno = new ArrayList();
     getConnection();
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM" + ShemaBB.TAB_ALU;
            resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                String nombre = resultSet.getString(ShemaBB.COL_NOMBRE);
                String apellido =  resultSet.getString(ShemaBB.COL_APELLIDO);
                int edad =  resultSet.getInt(ShemaBB.COL_EDAD);
                int id = resultSet.getInt(ShemaBB.COL_ID);
                Alumno alumno = new Alumno(nombre,apellido,edad);
                listaAlumno.add(alumno);
                System.out.println(alumno.getNombre());
                System.out.println(apellido);
                System.out.println(edad);
                System.out.println(id);
            }
            procesarArrary(listaAlumno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
