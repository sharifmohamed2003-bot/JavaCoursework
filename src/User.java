
public class User extends Address {
	
	private int ID;
	private String username;
	private String name;
	private UserType type;

	public User(String postcode, int houseNum, String city, int ID, String username, String name, UserType type) {
		super(postcode, houseNum, city);
		this.ID = ID;
		this.name = name;
		this.username = username;
		this.type = type;
	}
	public int getID() {
		return this.ID;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getName() {
		return this.name;
	}
	
	public UserType getType() {
		return this.type;
	}
	
	public void setUsername(String newUsername) {
		this.username = newUsername;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
