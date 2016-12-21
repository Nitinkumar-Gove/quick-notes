/**
 * Profile proxy to validate profile updates
 * @author Nitinkumar Gove
 *
 */
public interface ProfileProxy {
	public void updateUsername(String username, String password);
	public void updatePassword(String newpassword, String currentpassword);
	public void updateEmailId(String emailid, String password);
}
