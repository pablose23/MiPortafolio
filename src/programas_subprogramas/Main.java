package programas_subprogramas;

import java.util.*;

public class Main {

	static char [] CharsRuleta = {'A','D','R','I','S','E'};
	
	public static void main (String[] args) {
		Scanner S = new Scanner(System.in);
		char[][] Roulette = new char[3][3];
		String NombreJug, seguir;
		int turno = 0, apuesta, juego, GananciaRuleta;
		boolean gambling = true, round;
		player Casino = new player ("La casa", 0, 0, 0);
		
		try {
			System.out.println("Bienvenido al casino java.");
			System.out.println("Introduzca su nombre de jugador:");
			NombreJug = S.next();
			
			player Jugador = new player (NombreJug, 0, 0, 1000);
			
			System.out.println(" Fondos Iniciales: "+Jugador.getFondos()+"\n");
			System.out.println(" ¿Qué va a querer jugar?\n 1 -> Black Jack\n 2 -> Tragaperras");
			juego = S.nextInt();
			
			if (juego == 2)
				System.out.println(PrintTablaJackpotsRuleta());
			
			if (juego == 1) {
				do {
					System.out.println("\n Iniciando juego... \n - - BlackJack - - \n");
					Jugador.setHand(0);
					Casino.setHand(0);
					
					do {
						System.out.println("Introduzca su apuesta, sus fondos actuales son: "+Jugador.getFondos());
						apuesta = S.nextInt();
					} while (apuesta > Jugador.getFondos());
					
					do {
						
						round = true;
						
						if (round) {
							Jugador.setHand(Jugador.getHand()+sacarCartaJugador());
							System.out.println("Mano actual: "+Jugador.getHand());
							System.out.println("1. Sacar carta\n2. Plantarse");
							turno = S.nextInt();
						}					
						
						if (turno == 2 || Jugador.getHand() > 21) {
							round = false;
							System.out.println("Su mano suma: "+Jugador.getHand());
							Casino.setHand(sacarCartaCasa());
							System.out.println(Casino.getName()+" ha sacado "+Casino.getHand());
							
							if (Jugada(Jugador,Casino.getHand(), apuesta)) {
								System.out.println("Ha ganado "+Jugador.getName());
								Jugador.setWins(((Jugador.getWins())+1));
							} else {
								System.out.println("Ha ganado "+Casino.getName());
								Jugador.setLosses(((Jugador.getLosses())+1));
							}
							
							System.out.println("\n Wins:"+Jugador.getWins()+", Losses: "+Jugador.getLosses());
						}
						
					} while (turno != 2 && round);
					
					if (Jugador.getFondos()>0) {
						System.out.println("¿Quiere jugar otra ronda?\n 1 -> Sí\n Otra entrada -> No");
						seguir = S.next();
						if (!seguir.equals("1")) 
							gambling = false;
					} else {
						System.out.println("Saldo agotado, saliendo...");
						gambling = false;
					}
					
				} while (gambling);
/* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - */
			} else if (juego == 2) {
				do {
					System.out.println("\n Iniciando juego... \n - - Tragaperras - - \n");
					
					do {
						System.out.println("Introduzca su modo de ruleta, sus fondos actuales son: "
						+Jugador.getFondos()+"\n 1 -> Apuesta de 10€, Solo gana si la linea central coincide"
						+ "\n 2 -> Apuesta de 20€, Solo gana si coinciden líneas horizontales"
						+ "\n 3 -> Apuesta de 30€, Gana si hay 3 en cualquier línea, incluido diagonales");
						apuesta = S.nextInt();
					} while (apuesta*10 > Jugador.getFondos() || apuesta > 4 && apuesta < 1);
					
					GenerarRuleta(Roulette);
					
					switch (apuesta) {
						case 1:
							System.out.println("Tirando a la ruleta con apuesta de 10€...");
							System.out.println(PrintRuleta(Roulette));
							GananciaRuleta = Ruleta(Roulette, apuesta);
							if (GananciaRuleta > 0) {
								System.out.println("Ganó un total de "+GananciaRuleta+"€!!");
								Jugador.setFondos(Jugador.getFondos()+GananciaRuleta);
								Jugador.setWins(((Jugador.getWins())+1));
							} else {
								System.out.println("Perdió...");
								Jugador.setFondos(Jugador.getFondos()-10);
								Jugador.setLosses(((Jugador.getLosses())+1));
							}
							break;
						case 2:
							System.out.println("Tirando a la ruleta con apuesta de 20€...");
							System.out.println(PrintRuleta(Roulette));
							GananciaRuleta = Ruleta(Roulette, apuesta);
							if (GananciaRuleta > 0) {
								System.out.println("Ganó un total de "+GananciaRuleta+"€!!");
								Jugador.setFondos(Jugador.getFondos()+GananciaRuleta);
								Jugador.setWins(((Jugador.getWins())+1));
							} else {
								System.out.println("Perdió...");
								Jugador.setFondos(Jugador.getFondos()-20);
								Jugador.setLosses(((Jugador.getLosses())+1));
							}
							break;
						case 3:
							System.out.println("Tirando a la ruleta con apuesta de 30€...");
							System.out.println(PrintRuleta(Roulette));
							GananciaRuleta = Ruleta(Roulette, apuesta);
							if (GananciaRuleta > 0) {
								System.out.println("Ganó un total de "+GananciaRuleta+"€!!");
								Jugador.setFondos(Jugador.getFondos()+GananciaRuleta);
								Jugador.setWins(((Jugador.getWins())+1));
							} else {
								System.out.println("Perdió...");
								Jugador.setFondos(Jugador.getFondos()-30);
								Jugador.setLosses(((Jugador.getLosses())+1));
							}
							break;
						default:
							System.out.println("Opción de juego no válida");
					}
					
					if (Jugador.getFondos()>0) {
						System.out.println("¿Quiere jugar otra ronda?\n Cualquier entrada -> Sí"
						+ "\n 1 -> No");
						seguir = S.next();
						if (seguir.equals("1")) 
							gambling = false;
					} else {
						System.out.println("Saldo agotado, saliendo...");
						gambling = false;
					}
					
				} while (gambling);
			}
			
			System.out.println("\nSus estadísticas de la sesión son:\n "+Jugador.PlayerToString());
			
		} catch (InputMismatchException e) {
			System.out.println("Error en la entrada de datos... Saliendo.");
		}
		
		S.close();
	}

	private static int sacarCartaJugador() {
		int res;
		do {
			res = (int) (1+(Math.random()*12));
		} while (res == 8 || res == 9);
		return res;
	}
	
	private static int sacarCartaCasa() {
		return (int) (16+(Math.random()*9));
	}

	private static boolean Jugada(player J, int ManoC, int Apuesta) {
		boolean win;
		
		if (ManoC > 21 && J.getHand() <= 21) {
			win = true;
			J.setFondos((J.getFondos())+Apuesta);
		} else {
			if (21 - J.getHand() < 21-ManoC && J.getHand() <= 21) {
				win = true;
				J.setFondos((J.getFondos())+Apuesta);
			} else {
				win = false;
				J.setFondos((J.getFondos())-Apuesta);
			}
		}
		
		return win;
	}
	
	private static void GenerarRuleta(char[][] roulette) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				roulette[i][j] = CharsRuleta[((int) (1+Math.random()*6))-1];
			}
		}
		
	}

	private static String PrintRuleta(char[][] R) {
		String res = "";
		for (int i = 0; i < 3; i++) {
			res += "[";
			for (int j = 0; j < 3; j++) {
				res += " "+R[i][j]+" ";
			}
			res += "]\n";
		}
		return res;
	}
	
	private static String PrintTablaJackpotsRuleta() {
		return "- - - - Tabla de Jackpot - - - -"
		+ "\n\t"+CharsRuleta[0]+" -> Apuesta x 2"
		+ "\n\t"+CharsRuleta[1]+" -> Apuesta x 3"
		+ "\n\t"+CharsRuleta[2]+" -> Apuesta x 5"
		+ "\n\t"+CharsRuleta[3]+" -> Apuesta x 8"
		+ "\n\t"+CharsRuleta[4]+" -> Apuesta x 10"
		+ "\n\t"+CharsRuleta[5]+" -> Apuesta x 15";
	}
	
	private static int Ruleta (char[][] R, int Option) {
		int Win = 0;
		
		// Fila central
		if (R[1][0] == R[1][1] && R[1][1] == R[1][2])
			Win += Option*10*TipoWinRuleta (R[1][0]);
		
		// Fila superior e inferior
		if(Option == 2 || Option == 3) {
			if (R[0][0] == R[0][1] && R[0][1] == R[0][2])
				Win += Option*10*TipoWinRuleta (R[0][0]);
			
			if (R[2][0] == R[2][1] && R[2][1] == R[2][2])
				Win += Option*10*TipoWinRuleta (R[2][0]);
		}
		
		//Diagonales
		if (Option == 3) {
			if (R[0][0] == R[1][1] && R[1][1] == R[2][2])
				Win += Option*10*TipoWinRuleta (R[1][1]);
			
			if (R[2][0] == R[1][1] && R[1][1] == R[0][2])
				Win += Option*10*TipoWinRuleta (R[1][1]);
		}
		
		return Win;
	}
	
	private static int TipoWinRuleta (char C) {
		
		if(C == CharsRuleta[0])
			return 1;
		if(C == CharsRuleta[1])
			return 2;
		if(C == CharsRuleta[2])
			return 4;
		if(C == CharsRuleta[3])
			return 7;
		if(C == CharsRuleta[4])
			return 9;
		if(C == CharsRuleta[5])
			return 14;
		
		return 0;
	}
}
