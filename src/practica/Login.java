package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textoNombre;
	private JTextField textoContraseña;
	static Login frame1;

	public JTextField getTextoNombre() {
		return textoNombre;
	}

	public void setTextoNombre(JTextField textoNombre) {
		this.textoNombre = textoNombre;
	}

	public JTextField getTextoContraseña() {
		return textoContraseña;
	}

	public void setTextoContraseña(JTextField textoContraseña) {
		this.textoContraseña = textoContraseña;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Login();
					frame1.setVisible(true);
					GruposCanciones.frame2 = new GruposCanciones();
					GruposCanciones.frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 228, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel tituloLogin = new JLabel("Login");
		tituloLogin.setHorizontalAlignment(SwingConstants.CENTER);
		tituloLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		tituloLogin.setBounds(105, 21, 222, 28);
		contentPane.add(tituloLogin);

		JLabel nombreUsuario = new JLabel("Nombre de Usuario:");
		nombreUsuario.setForeground(new Color(128, 128, 128));
		nombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		nombreUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		nombreUsuario.setBounds(10, 74, 193, 28);
		contentPane.add(nombreUsuario);

		JLabel usuarioContraseña = new JLabel("Contraseña:");
		usuarioContraseña.setHorizontalAlignment(SwingConstants.CENTER);
		usuarioContraseña.setForeground(Color.GRAY);
		usuarioContraseña.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		usuarioContraseña.setBounds(10, 137, 193, 28);
		contentPane.add(usuarioContraseña);

		textoNombre = new JTextField();
		textoNombre.setBounds(213, 76, 168, 28);
		contentPane.add(textoNombre);
		textoNombre.setColumns(10);

		textoContraseña = new JTextField();
		textoContraseña.setColumns(10);
		textoContraseña.setBounds(213, 138, 168, 28);
		contentPane.add(textoContraseña);

		JButton botonEntrar = new JButton("Entrar");
		botonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				if(frame1.getTextoNombre().getText().equals("admin") && 
						frame1.getTextoContraseña().getText().equals("admin")) {
					GruposCanciones.frame2.setVisible(true);
				}else
					GruposCanciones.frame2.setVisible(false);
			}
		});
		botonEntrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		botonEntrar.setBounds(153, 210, 126, 28);
		contentPane.add(botonEntrar);
	}
}
