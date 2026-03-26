
public class Address {
	private String postcode;
	private int houseNum;
	private String city;
	
	public Address(String postcode, int houseNum, String city) {
		this.city = city;
		this.houseNum = houseNum;
		this.postcode = postcode;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getPostcode() {
		return this.postcode;
	}
	
	public int getHouseNum() {
		return this.houseNum;
	}
	
	public void setHouseNum(int newHouseNum) {
		this.houseNum = newHouseNum;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public void setPostcode(String newPostcode) {
		this.postcode = newPostcode;
	}
	
	@Override
	public String toString() {
		return houseNum + " " + postcode + " " + city;
		
	}
}