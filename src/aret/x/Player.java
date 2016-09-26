package aret.x;

public class Player {
	private String Jugador;
	private int ID ;
	public Player(String Nombre, int id){
		this.Jugador = Nombre;
		this.ID = id;
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
	
	public int ReturnID(){
		return ID;
	}
	
	public int ReturnID(boolean opt){
		if (opt == true){
			System.out.println(ID);}
		return ID;
	}
	
	
public class Turno {
		public int Turno;
		private String CurrentPlayerTurno;
	
	
		public Turno(String jugador, int Turno){
			this.CurrentPlayerTurno = jugador;
			this.Turno = Turno;}
		
		 public int ReturnTurno(){
			 return this.Turno;}
		 
		 public int ReturnTurno(boolean opt){
			 if (opt==true) {
				System.out.println(Turno);}
			 return this.Turno;}
		 
		 public void AddTurno(){
			 this.Turno += 1;}
		 
		public void AddTurno(int TurnoEspecifico){
			this.Turno += TurnoEspecifico;}
		
		}
	}



