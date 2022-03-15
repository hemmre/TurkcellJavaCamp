package Instagram;

public class Live extends Share{

	private String comment;
	private int participants;
	
	public Live() {
		super();
	}
	
	public Live(int id, String userName, double time, String comment, int participants) {
		super(id, userName, time);
		this.comment = comment;
		this.participants = participants;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	
}
