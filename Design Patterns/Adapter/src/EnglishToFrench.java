
public class EnglishToFrench implements IEnglish{

	private FrenchTutor ftoe;
	
	public EnglishToFrench() {
		// TODO Auto-generated constructor stub
		ftoe = new FrenchTutor();
	}
	
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		ftoe.coach();
	}

}
