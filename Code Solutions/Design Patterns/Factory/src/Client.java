/**
 * This class creates and accesses the HurdleFactory.
 * @author Nitinkumar Gove
 * @version 1.0
 */
public class Client {
	
	public static void main(String [] args )
	{
		HurdleFactory hf = new HurdleFactory();
		
		Hurdle h =  hf.getHurdle("bat");
		if(h!=null)
			h.action();
		
		h = hf.getHurdle("dragon");
		if(h!=null)
			h.action(); 
		
	}

}
