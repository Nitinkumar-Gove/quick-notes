
public class OffState implements State {
	
	Switch swtch;
	
	public OffState(Switch swtch) {
		super();
		this.swtch = swtch;
	}

	@Override
	public void pressButton() {
		// TODO Auto-generated method stub
		swtch.setState(swtch.getOnstate());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "OFF";
	}

}
