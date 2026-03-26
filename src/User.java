
public class User {
	
	private int ID;
	private String username;
	private String name;
	private UserType type;
	private Address address;
	
	public User(int ID, String username, String name, UserType type, Address address) {
        this.ID = ID;
        this.username = username;
        this.name = name;
        this.type = type;
        this.address = address;
	}
	 public Address getAddress() {
		return this.address;
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
	    return "ID: " + ID + ", Name: " + name + ", Username: " + username +
	           ", Type: " + type + ", Address: " + getAddress();
	}

}
