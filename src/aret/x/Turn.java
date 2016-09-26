package aret.x;

public class Turn {
	public int Turno;
	private String CurrentPlayerTurno;


	public Turn(int Turno){
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