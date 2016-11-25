/**
 * This class models the Dragon Hurdle. 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Dragon implements Hurdle{
	
	String action;
	
	public Dragon(){
		action = "burn everything";
	}

	@Override
	public void action(){
		System.out.println(action);
	}

}
