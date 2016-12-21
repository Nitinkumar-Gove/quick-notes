
public class Display {
	MessageStrategy strategy;
	String name;
	
	public Display(){
		strategy = new Simple();
		name = "";
	}
	
	public void greetUser(String name){
		strategy.showMessage(name);
	}
	
	public void changeGreeting(MessageStrategy st){
		this.strategy = st;
	}
	
}
