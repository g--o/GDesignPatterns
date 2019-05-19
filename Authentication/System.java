
/**
 * This class is the System class
 * It's a singleton final class which means you cannot inherit it
 * (there is no abstract final class in java)
 */
public final class System {

    private final static System INSTANCE = new System(); // Singleton design pattern

	/**
	 * action only an active (authorized) user can do
	 */
	public void privillegedAction()
    {
        // whatever action
    }
	
	/**
	 * action any user can do
	 */
	public static void guestAction()
	{
		// whatever action
	}
	
	/**
	 * authorize
	 */
    public static System login(String username, String password) // Authenticate
    {
		if(Authenticator.Auth(username, password))
            return getInstance();
        else
            return null;
    }

	/**
	 * c'tor
	 * private (singleton)
	 */
    private System()
    {
		
    }

	/**
	 * instance getter (singleton)
	 */
    private static System getInstance()
    {
        return INSTANCE;
    }

}
