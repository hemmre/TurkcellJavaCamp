package Instagram;

public class DirectMessage extends User{

	private String receiverUser;
	private String message;
	
	public DirectMessage() {
		super();
	}
	
	public DirectMessage(int id, String userName, String password, String profilePicture, String bio, int followers,
			int following, String receiverUser, String message) {
		super(id, userName, password, profilePicture, bio, followers, following);
		this.receiverUser = receiverUser;
		this.message = message;
	}

	public String getReceiverUser() {
		return receiverUser;
	}

	public void setReceiverUser(String receiverUser) {
		this.receiverUser = receiverUser;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
