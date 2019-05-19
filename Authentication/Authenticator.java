
/**
 * Created by user-pc on 17/02/2015.
 *
 * This class is the Authenticator class
 * It's a singleton final class which means you cannot inherit it
 * (there is no abstract final class in java)
 */

public final class Authenticator {
	/**
	 * Dummy authentication
	 * use whatever method you'd like
	 */
    public static boolean auth(String username, String password) // Authenticate
    {
		return (username.Equals("admin") && password.Equals("secret password"));
    }
}
