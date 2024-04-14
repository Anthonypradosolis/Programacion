import javax.swing.*;
import java.awt.*;
public class Aplicacion extends JFrame {
    private RedSocial redsocial;
    private Usuario usuario;
    public Aplicacion(){
        redsocial = new RedSocial();
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton registrarButton = new JButton("Registrarse");
        registrarButton.addActionListener(e -> {
            String nombreUsuario = JOptionPane.showInputDialog("Nombre de usuario:");
            String contrasena = JOptionPane.showInputDialog("Contraseña:");
            if (redsocial.registrarse(nombreUsuario, contrasena)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso.");
            } else {
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.");
            }
        });

        JButton iniciarSesionButton = new JButton("Iniciar sesión");
        iniciarSesionButton.addActionListener(e -> {
            String nombreUsuario = JOptionPane.showInputDialog("Nombre de usuario:");
            String contrasena = JOptionPane.showInputDialog("Contraseña:");
            if (redsocial.iniciarSesion(nombreUsuario, contrasena)) {
                usuario = redsocial.getUsuario(nombreUsuario);
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
            }
        });

        JButton publicarButton = new JButton("Publicar mensaje");
        publicarButton.addActionListener(e -> {
            if (usuario!= null) {
                String mensaje = JOptionPane.showInputDialog("Mensaje:");
                redsocial.publicarMensaje(usuario.getNombre(), mensaje);
                JOptionPane.showMessageDialog(null, "Mensaje publicado.");
            } else {
                JOptionPane.showMessageDialog(null, "Debe iniciar sesión para publicar un mensaje.");
            }
        });

        JButton verPublicacionesButton = new JButton("Ver publicaciones");
        verPublicacionesButton.addActionListener(e -> {
            StringBuilder publicaciones = new StringBuilder();
            for (Publicacion publicacion : redsocial.verPublicacion()) {
                publicaciones.append(publicacion.getNombre()).append(": ").append(publicacion.getMensaje()).append("\n");
            }
            JOptionPane.showMessageDialog(null, publicaciones.toString());
        });
        panel.add(registrarButton);
        panel.add(iniciarSesionButton);
        panel.add(publicarButton);
        panel.add(verPublicacionesButton);
        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
