/**
 * Simple test client
 * @author Nitinkumar Gove
 *
 */
public class Test {
	public static void main(String ar[]){
		
		ProfileProxy profile = new PasswordProxy();
		profile.updatePassword("abcd", "abc123fLMN");
		
		
		// ProfileProxy eproxy = new PasswordProxy();
		// eproxy.updatePassword("jklmnop", "abc123LMN");
	}
}
