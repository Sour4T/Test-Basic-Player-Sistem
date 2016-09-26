package aret.x;

import aret.x.Player.Turno;

public class Main {

	public static void main(String[] args) {
		
		Player ply1 = new Player("Hola",1);
		Player.Turno turno = ply1.new Turno(ply1.ReturnJugador(),0);
		turno.ReturnTurno(true);
		
	}

	


}
	

