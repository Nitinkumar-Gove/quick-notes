/**
 * This class is a entry point for this project.
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class Client {
	
	public static void main(String [] ar)
	{
		Player p = new Player();
		p.setScore(100);
		
		// print initial score
		System.out.println(" [ Client ] - Score : " + p.getScore());
		
		// create a score board
		ScoreBoard sb = new ScoreBoard(p);
		
		// updating score
		p.setScore(137);
		p.setScore(45);
		p.setScore(240);
		
		
	}

}
