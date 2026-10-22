package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class GruposCanciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CodigoGrupo;
	static GruposCanciones frame2;
	private ArrayList<Grupos>grupos;
	private ArrayList<Canciones>canciones;
	
	public JTextField getCodigoGrupo() {
		return CodigoGrupo;
	}

	public void setCodigoGrupo(JTextField codigoGrupo) {
		CodigoGrupo = codigoGrupo;
	}

	public ArrayList<Grupos> getGrupos() {
		return grupos;
	}

	public void setGrupos(ArrayList<Grupos> grupos) {
		this.grupos = grupos;
	}

	public ArrayList<Canciones> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Canciones> canciones) {
		this.canciones = canciones;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 = new GruposCanciones();
					frame2.setVisible(true);
					GruposCanciones.frame2=new GruposCanciones();
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
	public GruposCanciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1222, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tituloGrupoCanciones = new JLabel("Grupos y Canciones");
		tituloGrupoCanciones.setBounds(69, 52, 368, 54);
		tituloGrupoCanciones.setFont(new Font("Tahoma", Font.BOLD, 30));
		tituloGrupoCanciones.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tituloGrupoCanciones);
		
		JButton botonGrupos = new JButton("Mostrar Grupos");
		botonGrupos.setBounds(83, 193, 284, 54);
		contentPane.add(botonGrupos);
		
		JButton botonCanciones = new JButton("Ver Canciones");
		botonCanciones.setBounds(83, 291, 284, 54);
		contentPane.add(botonCanciones);
		
		JButton botonCaGr = new JButton("Ver Canciones del grupo:");
		botonCaGr.setBounds(85, 400, 284, 54);
		contentPane.add(botonCaGr);
		
		JLabel tituloVerCanciones = new JLabel("Ver Canciones de un Grupo concrerto");
		tituloVerCanciones.setBounds(40, 464, 374, 54);
		tituloVerCanciones.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloVerCanciones.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(tituloVerCanciones);
		
		CodigoGrupo = new JTextField();
		CodigoGrupo.setBounds(130, 529, 223, 54);
		contentPane.add(CodigoGrupo);
		CodigoGrupo.setColumns(10);
		
		JTextArea mostrar = new JTextArea();
		botonGrupos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar.setText("");
		            for (Grupos g : grupos) {
		                mostrar.append("ID: " + g.getCodigo() + " - Disco: " + g.getNombre() + "\n");
		        }
				
			}
		});
		
		botonCanciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar.setText("");
		            for (Canciones c : canciones) {
		                mostrar.append("ID: "+c.getCodigo()+" Disco: "+c.getDisco()+" -Nombre: "+c.getNombre()+ " --"+c.getDuraccion()+" MINS"+ "\n");
		        }
				
			}
		});
		
		botonCaGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrar.setText("");
				String codigoGrupo = CodigoGrupo.getText();
				for (Grupos g : grupos) {
					if(g.getCodigo().equals(CodigoGrupo.getText())) {
						mostrar.append("Canciones del Grupo: " + g.getNombre()+ "\n");
						for (Canciones c : canciones) {
							if(c.getCodigo().equals(g.getCodigo()))
			                mostrar.append("Disco: "+c.getDisco()+" -Nombre: "+c.getNombre()+ " --"+c.getDuraccion()+" MINS"+ "\n");
						}
					}
	        }
			}
		});
	
		mostrar.setEditable(false);
		mostrar.setBounds(534, 75, 598, 551);
		contentPane.add(mostrar);
		
		this.canciones=new ArrayList<Canciones>();
		this.grupos=new ArrayList<Grupos>();
		
		leerGrupos("Grupos.csv");
		leerCanciones("Canciones_Actualizadas.csv");
	}
	
	public void leerGrupos(String fichero) {
		File f=new File(fichero);
		try {
			Scanner entrada=new Scanner(f);
			String cadena;
			String linea[];
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				//System.out.println(cadena);
				linea = cadena.split(",");
				if(linea.length > 3 && !linea[3].isEmpty())
				this.grupos.add(new Grupos(linea[0], linea[1], Integer.parseInt(linea[2]), linea[3]));
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No esxiste");
		}
	}
	
	public void leerCanciones(String fichero) {
		File f=new File(fichero);
		try {
			Scanner entrada=new Scanner(f);
			String cadena;
			String linea[];
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				//System.out.println(cadena);
				linea = cadena.split(",");
				if(linea.length > 3 && !linea[3].isEmpty())
				this.canciones.add(new Canciones(linea[0], linea[1], linea[2], Double.parseDouble(linea[3])));
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No esxiste");
		}
	}
}
