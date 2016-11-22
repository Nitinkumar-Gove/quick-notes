import java.util.ArrayList;

/**
 * This class models a player behaviour
 * @author Nitinkumar Gove
 * @version 1.0
 */

public class Player {
	
	private int score;
	private ArrayList<ScoreObserver> obs = new ArrayList<ScoreObserver>();

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
		
		// notify all the observers about the change in score
		notifyEveryone();
	}
	
	public void observe(ScoreObserver s)
	{
		obs.add(s);
	}	
	
	public void notifyEveryone()
	{
		for(ScoreObserver so : obs)
			so.updateView();
	}
	
}
