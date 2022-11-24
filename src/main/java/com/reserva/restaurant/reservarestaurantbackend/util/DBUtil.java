package com.reserva.restaurant.reservarestaurantbackend.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static Connection connection = null;

    //Consigue la conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        if(connection != null){
            return connection;
        }else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost/control_reservas?useSSL=false";
            String user = "root";
            String password = "";
            try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }

        return connection;
    }
}