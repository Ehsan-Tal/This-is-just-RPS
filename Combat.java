package selfPractice;

import java.util.Random;

public class Combat {
	public static void main(String[] args) {
	
		Character p1 = new Character( "Ehi", 1 );
		Character p2 = new Character( "Ronaldo", 2 );

		for(int i = 0; i<3; i++) {
			moveRandomiser(p1);
			moveRandomiser(p2);
			
			fightProcessor(p1, p2);

		}

		p1.info();
		p2.info();
		
	} // end of main()

	static final int Rock = 1;
	static final int Paper = 2;
	static final int Scissor = 3;

	static void moveRandomiser(Character player) {
		Random rand = new Random();
		int upperbound = 3;
		
		player.setMove(rand.nextInt( upperbound +1 ) );
	}
	
	
	static void fightProcessor(Character p1, Character p2) {
		/** This void function is made to process the outcome of the fight and signal the win and losses accordingly.
		 *  Validation will be held during the input of the move.
		 *  I could use the or operator to chunk up all the times Player one wins etc.,
		 * */
	
		if ( (p1.move == Rock && p2.move == Scissor) || (p1.move == Scissor && p2.move == Paper) || (p1.move == Paper && p2.move == Rock) ) {
			p1.playerWon();
			p2.playerLost();
		}
		else if ( ( p1.move == Rock && p2.move == Paper ) || ( p1.move == Scissor && p2.move == Rock ) || ( p1.move == Paper && p2.move == Scissor ) ) {
			p1.playerLost();
			p2.playerWon();
		}
		else {
			p1.playerTied();
			p2.playerTied();
		}
		
	}
	
}
