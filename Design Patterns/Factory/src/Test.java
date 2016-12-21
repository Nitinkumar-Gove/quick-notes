/**
 * 
 * @author Nitinkumar Gove
 * 
 */
public class Test {
	public static void main(String [] a){
		ToppingFactory factory = new ToppingFactory();
		
		Topping toAdd = factory.getTopping("spinach");
		System.out.println("spinach - price - " + toAdd.getPrice());
		
		toAdd = factory.getTopping("onions");
		System.out.println("onions - price - " + toAdd.getPrice());
		
		toAdd = factory.getTopping("veggies");
		System.out.println("vegies - price - " + toAdd.getPrice());
		
	}

}
