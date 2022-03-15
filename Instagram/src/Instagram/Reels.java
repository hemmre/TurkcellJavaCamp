package Instagram;

public class Reels extends Share {
	
	private String reelsVideo;
	private String reelsDescription;
	private String sharedUserName;
	private String comment;
	private int like;
	
	public Reels() {
		super();
	}

	public Reels(int id, String userName, double time, String reelsVideo, String reelsDescription,
			String sharedUserName, String comment, int like) {
		super(id, userName, time);
		this.reelsVideo = reelsVideo;
		this.reelsDescription = reelsDescription;
		this.sharedUserName = sharedUserName;
		this.comment = comment;
		this.like = like;
	}

	public String getReelsVideo() {
		return reelsVideo;
	}

	public void setReelsVideo(String reelsVideo) {
		this.reelsVideo = reelsVideo;
	}

	public String getReelsDescription() {
		return reelsDescription;
	}

	public void setReelsDescription(String reelsDescription) {
		this.reelsDescription = reelsDescription;
	}

	public String getSharedUserName() {
		return sharedUserName;
	}

	public void setSharedUserName(String sharedUserName) {
		this.sharedUserName = sharedUserName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	
}
