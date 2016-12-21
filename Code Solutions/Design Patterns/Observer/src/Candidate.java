/**
 * @author Nitinkumar Gove
 */
public class Candidate extends Observer{
	
	int value = 0 ;
	public Candidate(Leader leader){
		this.leader = leader;	
		leader.startListening(this);
		this.value = 0;
		printValue();
	}
	public void printValue(){
		System.out.println("Candidate -" + value);
	}

	@Override
	public void replicateScore() {
		// TODO Auto-generated method stub
		value = leader.getValue();
		printValue();
		
	}

}
