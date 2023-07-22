/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
 
    private static final String URL = "jdbc:mysql://localhost:3306/felinus";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "Abisai1456";

    private Connection connection;

    public void conectar() {
        try {
            connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        }
    }

    public void desconectar() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
