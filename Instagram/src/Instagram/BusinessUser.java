package Instagram;

public class BusinessUser extends User {
	
	private String website;
	private String contactNumber;
	
	public BusinessUser() {
		super();
	}

	public BusinessUser(int id, String userName, String password, String profilePicture, String bio, int followers,
			int following, String website, String contactNumber) {
		super(id, userName, password, profilePicture, bio, followers, following);
		this.website = website;
		this.contactNumber = contactNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
}
