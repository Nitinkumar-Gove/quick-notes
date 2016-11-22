/**
 * This is a observer interface which every observer for player score should implement.
 * @author Nitinkumar Gove
 * @version 1.0
 */
public abstract class ScoreObserver {
	Player player = null;
	public abstract void updateView();
}
