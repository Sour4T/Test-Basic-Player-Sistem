package aret.x;

public class Player {
	private String Jugador;
	private int ID ;
	
	public Player(String name){
		this.Jugador = name;
		this.ID = ID;
	}
	
	public void JugadorChangeName(String Jugador){
		this.Jugador = Jugador;
	}
	
	public String ReturnJugador(){
		return Jugador;
	}
	
	public String ReturnJugador(boolean opt){
		if (opt == true){
			System.out.println(Jugador);}
		return Jugador;
	}
	
	public void setID(int id){
		this.ID = id;}
	
	public int ReturnID(){
		return ID;
	}
	
	public int ReturnID(boolean opt){
		if (opt == true){
			System.out.println(ID);}
		return ID;
	}
	
	
	}



