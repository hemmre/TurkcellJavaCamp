package Instagram;

public class Share {

	private int id;
	private String userName;
	private double time;
	
	public Share() {
		super();
	}

	public Share(int id, String userName, double time) {
		super();
		this.id = id;
		this.userName = userName;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
}
