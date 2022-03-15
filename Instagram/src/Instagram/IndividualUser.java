package Instagram;

public class IndividualUser extends User {
	
	private String birthDay;

	public IndividualUser() {
		super();
	}

	public IndividualUser(int id, String userName, String password, String profilePicture, String bio, int followers,
			int following, String birthDay) {
		super(id, userName, password, profilePicture, bio, followers, following);
		this.birthDay = birthDay;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	
	

}
