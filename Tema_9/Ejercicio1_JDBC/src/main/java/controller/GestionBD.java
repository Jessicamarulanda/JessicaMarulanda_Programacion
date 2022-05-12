package controller;

import database.ShemaBB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestionBD {
    private  Connection conn;
    private  void getConnection() {
        String host = "127.0.0.1:3306";
        String dtbs = ShemaBB.DB_NAME;
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

    
}
