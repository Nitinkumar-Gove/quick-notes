/**
 * This is a scoreboard class which displays players scoreboard on screen.
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class ScoreBoard extends ScoreObserver {
	
	public ScoreBoard(Player player)
	{
		this.player = player;
		player.observe(this);
	}
	
	public void updateView()
	{
		System.out.println(" [ Score Board] - Score : " + player.getScore());
	}
	

}
