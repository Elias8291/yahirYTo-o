/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vista.Pedidos;

public class LoginController {
    private JTextField txtUsuario;
    private JPasswordField txtContraseña;
    private JButton btnIniciarSesion;
    private UsuarioDAO usuarioDAO;

    public LoginController(JTextField txtUsuario, JPasswordField txtContraseña, JButton btnIniciarSesion) {
        this.txtUsuario = txtUsuario;
        this.txtContraseña = txtContraseña;
        this.btnIniciarSesion = btnIniciarSesion;
        this.usuarioDAO = new UsuarioDAO();

        // Remove all existing ActionListeners
        for (ActionListener al : btnIniciarSesion.getActionListeners()) {
            btnIniciarSesion.removeActionListener(al);
        }

        // Add a new ActionListener
        btnIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreUsuario = txtUsuario.getText();
                String contraseña = new String(txtContraseña.getPassword());
                if (usuarioDAO.verificarUsuario(nombreUsuario, contraseña)) {
                    abrirNuevaVentana();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });
    }

    private void abrirNuevaVentana() {
        Pedidos pedidos=new Pedidos();
        pedidos.setVisible(true);
    }
}
