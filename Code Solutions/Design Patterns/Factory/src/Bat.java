/**
 * This class models the Bat Hurdle. 
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Bat implements Hurdle{
	
	String action;
	
	public Bat(){
		action = "fly in night";
	}
	
	@Override
	public void action(){
		System.out.println(action);
	}

}
