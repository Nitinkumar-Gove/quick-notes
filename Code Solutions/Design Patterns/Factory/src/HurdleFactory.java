/**
 * This class allows user to create different hurdles.
 * @author Nitinkumar Gove
 * @version 1.0
 *
 */
public class HurdleFactory {
	
	public Hurdle getHurdle(String hurdle)
	{
		if(hurdle.equalsIgnoreCase("bat"))
			return new Bat();
		else if(hurdle.equalsIgnoreCase("dragon"))
			return new Dragon();
		else
			return null;
	}

}
