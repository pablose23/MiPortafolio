package programas_subprogramas;

public class player {

	String Name;
	int Wins;
	int Losses;
	int BlackJackHand;
	int Fondos;

	public player (String Nombre, int Victorias, int Derrotas, int Créditos) {
		Name = Nombre;
		Wins = Victorias;
		Losses = Derrotas;
		Fondos = Créditos;
	}
		
	public int getFondos() {
		return Fondos;
	}

	public void setFondos(int fondos) {
		Fondos = fondos;
	}
		
	public String getName () {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getWins() {
		return Wins;
	}

	public void setWins(int wins) {
		Wins = wins;
	}

	public int getLosses() {
		return Losses;
	}

	public void setLosses(int losses) {
		Losses = losses;
	}

	public int getHand() {
		return BlackJackHand;
	}

	public void setHand(int hand) {
		BlackJackHand = hand;
	}

	public String PlayerToString () {
		return "Nombre: "+getName()+", Wins: "+getWins()+", Losses: "+getLosses()+", Fondos: "+getFondos();
	}
}
