package controller;

import database.ShemaBB;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ControllerBD {

    private  Connection conn;
    private Statement statement;

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
    public void modificarAlumno(String nombre,int edadnueva)
    {
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


}
