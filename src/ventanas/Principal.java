package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Principal frame1;
	private JTextField campoNombre;
	
	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 = new Principal();
					frame1.setVisible(true);
					Ventana2.frame2=new Ventana2();
					Ventana2.frame2.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto1 = new JLabel("Dime tu nombre");
		texto1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		texto1.setBounds(230, 157, 158, 39);
		contentPane.add(texto1);
		
		campoNombre = new JTextField();
		campoNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		campoNombre.setBounds(428, 157, 238, 39);
		contentPane.add(campoNombre);
		campoNombre.setColumns(10);
		
		JButton boton1 = new JButton("Entrar");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				Ventana2.frame2.setVisible(true);
				Ventana2.frame2.getCampoNombre2().getText();
			}
		});
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton1.setBounds(320, 278, 228, 46);
		contentPane.add(boton1);
	}
}
