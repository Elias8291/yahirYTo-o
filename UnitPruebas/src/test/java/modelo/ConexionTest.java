/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Abisai
 */
public class ConexionTest {
    
     @Test
    void testConectar() {
        Conexion conexion = new Conexion();
        conexion.conectar();
        assertNotNull(conexion.getConnection(), "La conexion no se establecio");
    }
    
}
