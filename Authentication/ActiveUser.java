
/**
 * This uses the so called "proxy"/"factory" design patterns I just changed things a little.
 * This is a logged in account = active user.
 * You cannot create instance unless you are already authenticated!
 * This is a factory-esque class, and it uses the system class.
 *
 * NOTE: this works because down-casting is not allowed in java!
 */
public class ActiveUser extends User {

	/**
	 * action that is unique to authorized users
	 */
	public void action() {
		system.privillegedAction();
	}

	/**
	 * A static method for creating a new user.
	 */
	public static ActiveUser New(String username, String password)
	{
		system = System.login(username, password);

		if(system == null)
			return null;
		else
			return new ActiveUser(username);
	}

	/**
	 * c'tor (private)
	 */
	private ActiveUser(String name)
	{
		super(name);
	}

	private static System system = null; // Our system instance
}
