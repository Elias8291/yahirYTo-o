/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package control;

import modelo.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario();
    }

    @Test
    public void testIdUsuario() {
        System.out.println("get y set IdUsuario");
        usuario.setIdUsuario(1);
        assertEquals(1, usuario.getIdUsuario());
    }

    @Test
    public void testNombreUsuario() {
         System.out.println("get y set IdUsuario");
        usuario.setNombreUsuario("TestUser");
        assertEquals("TestUser", usuario.getNombreUsuario());
    }

    @Test
    public void testContraseña() {
         System.out.println("get y set Password");
        usuario.setContraseña("TestPassword");
        assertEquals("TestPassword", usuario.getContraseña());
    }

    @Test
    public void testIdRol() {
        usuario.setIdRol(1);
        assertEquals(1, usuario.getIdRol());
    }

    @Test
    public void testIdEmpleado() {
        usuario.setIdEmpleado(1);
        assertEquals(1, usuario.getIdEmpleado());
    }
}
