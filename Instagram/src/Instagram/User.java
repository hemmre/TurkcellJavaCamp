package Instagram;

public class User {
	
	private int Id;
	private String userName;
	private String password;
	private String profilePicture;
	private String bio;
	private int followers;
	private int following;
	
	public User() {
		super();
	}

	public User(int id, String userName, String password, String profilePicture, String bio, int followers,
			int following) {
		super();
		Id = id;
		this.userName = userName;
		this.password = password;
		this.profilePicture = profilePicture;
		this.bio = bio;
		this.followers = followers;
		this.following = following;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getFollowing() {
		return following;
	}

	public void setFollowing(int following) {
		this.following = following;
	}
	
}
