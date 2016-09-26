package aret.x;

import java.util.Scanner;


public class Main {
	

	private static Player[] player = new Player[99];
			
	public static void main(String[] args) {
			Run();
			
			
	}
	
	
	public static void Run(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st Player Choosing!");
		System.out.println("Name >> ");
		String player1 = sc.next();
		player[1] = new Player(player1);
		
		blankSpace(50);
		
		System.out.println("2nd Player Choosing!");
		System.out.println("Name >> ");
		String player2 = sc.next();
		player[2] = new Player(player2);
		
		blankSpace(50);
		loop();
	}
	
	public static void loop(){
	Turn turn = new Turn(0);//Starts in 0
	System.out.println("Turn of " + player[1].ReturnJugador());
	/*
	 * 
	 * code to execute
	 * 
	 * 
	 * */
	turn.AddTurno();//turn +1
	System.out.println("Turn of " + player[2].ReturnJugador());
	/*
	 * 
	 * code to execute
	 * 
	 * 
	 * We can restart loop now or create other metod to change the turn*/
	
	}
	public static void blankSpace(int blanks){
		for (int i = 0; i < blanks; i++){
			System.out.println();
			}
		}


}
	

