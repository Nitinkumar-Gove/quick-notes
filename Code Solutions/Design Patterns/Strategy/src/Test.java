/*
 * Test Class
 */
public class Test {
	public static void main(String a[]){
		
		Display display = new Display();
		display.greetUser("Gove");
		
		display.changeGreeting(new Fancy());
		display.greetUser("Gove");
	}
}
