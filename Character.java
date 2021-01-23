package selfPractice;

public class Character {
	
	String name;
	int move;
	int wins;
	int draws;
	int losses;
	
	
	Character(){
		this("Ali", 3);
	} // end of default constructor
	
	
	Character(String name, int move){
		this.name = name;
		this.move = move;
	} // end of custom constructor
	
	
	void playerWon() {
		this.wins += 1;
		System.out.println(name + " won !");
	};
	
	
	void playerLost() {
		this.losses += 1;
		System.out.println(name + " lost !");
	};
	
	
	void playerTied() {
		this.draws += 1;
		System.out.println(name + " tied !");
	};

	
	void setMove(int move) {
		this.move = move;
	}
	
	
	void info() {
		System.out.println( name + " won " + wins + " times, lost " + losses + " and drew "+ draws);
	}
	
} // end of class Character
