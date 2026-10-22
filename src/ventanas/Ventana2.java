package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Ventana2 frame2;
	private JTextField campoNombre2;
	
	public JTextField getCampoNombre2() {
		return campoNombre2;
	}

	public void setCampoNombre2(JTextField campoNombre2) {
		this.campoNombre2 = campoNombre2;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new Ventana2();
					frame2.setVisible(true);
					Principal.frame1=new Principal();
					Principal.frame1.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 923, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto2 = new JLabel("Bienvenido");
		texto2.setBounds(313, 201, 101, 44);
		texto2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(texto2);
		
		campoNombre2 = new JTextField();
		campoNombre2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		campoNombre2.setEditable(false);
		campoNombre2.setBounds(424, 201, 179, 44);
		contentPane.add(campoNombre2);
		campoNombre2.setColumns(10);
		
		JButton boton2 = new JButton("Volver a Principal");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				Principal.frame1.setVisible(true);
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		boton2.setBounds(332, 315, 179, 50);
		contentPane.add(boton2);
	}

}
