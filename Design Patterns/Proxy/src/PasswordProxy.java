/**
 * Proxy to manage Password updates
 * @author Nitinkumar Gove
 *
 */
public class PasswordProxy implements ProfileProxy {

	Profile profile = new Profile();
	

	@Override
	public void updatePassword(String newpassword, String currentpassword) {
		// TODO Auto-generated method stub
		
		if(getPassword().equalsIgnoreCase(currentpassword)){
			profile.setPassword(newpassword);
			System.out.println("Password Updated");
		}
		else{
			System.out.println("Unauthorized Access Not Allowed");
		}
		
	}

	@Override
	public void updateUsername(String username, String password) {
		// does nothing
		
	}

	@Override
	public void updateEmailId(String emailid, String password) {
		// does nothing
		
	}
	
	public String getPassword(){
		return "abc123LMN";
	}
}
