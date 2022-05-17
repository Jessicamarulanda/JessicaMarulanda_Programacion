package controller;

import database.ShemaBB;
import model.Usuarios;

import java.sql.*;

public class GestionBD {
    private  Connection conn;
    private PreparedStatement preparedStatement;
    private  void getConnection() {
        String newConnectionURL = "jdbc:mysql://" + ShemaBB.host + "/" + ShemaBB.DB_NAME
                + "?" + "user=" + ShemaBB.user + "&password=" + ShemaBB.pass;
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
    public void insertarPerfiles(){
        Statement statement = null;
        getConnection();
        try {
             statement = conn.createStatement();
             String  query1 = "INSERT INTO %s (%s) values ('Gerente')";
             statement.execute(String.format(query1,ShemaBB.TAB_Perfi,ShemaBB.COL_NOMBRE_U));
            String  query2 = "INSERT INTO %s (%s) values ('Trabajador')";
            statement.execute(String.format(query2,ShemaBB.TAB_Perfi,ShemaBB.COL_NOMBRE_U));
            String  query3 = "INSERT INTO %s (%s) values ('Director')";
            statement.execute(String.format(query3,ShemaBB.TAB_Perfi,ShemaBB.COL_NOMBRE_U));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                assert statement != null;
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }

    public void insertarUsuarios(Usuarios usuario){

        String query  =  "INSERT INTO usuario (nombre, apellido, telefono,pais,perfil) VALUES (?,?,?,?,?)";
        try {
            // no ejecuta la query --> la deja preparada
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2,usuario.getApellido());
            preparedStatement.setInt(3,usuario.getTelefono());
            preparedStatement.setString(5,usuario.getPais());
            preparedStatement.setInt(6,usuario.getPerfil());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }

    private void insertarusuarioin(Usuarios usuario)
    {
        String query  =  "INSERT INTO usuario (nombre, apellido, telefono,pais,perfil) VALUES (?,?,?,?,?)";
        try {
            // no ejecuta la query --> la deja preparada
            getConnection();
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, usuario.getNombre());
            preparedStatement.setString(2,usuario.getApellido());
            preparedStatement.setInt(3,usuario.getTelefono());
            preparedStatement.setString(5,usuario.getPais());
            preparedStatement.setInt(6,usuario.getPerfil());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }

}
