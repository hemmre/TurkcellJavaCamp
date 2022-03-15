package Instagram;

public class Post extends Share{
	
	private int postId;
	private String postImage;
	private String imageDescription;
	private String comment;
	private int like;
	
	public Post() {
		super();
	}

	public Post(int id, String userName, double time, int postId, String postImage, String imageDescription,
			String comment, int like) {
		super(id, userName, time);
		this.postId = postId;
		this.postImage = postImage;
		this.imageDescription = imageDescription;
		this.comment = comment;
		this.like = like;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostImage() {
		return postImage;
	}

	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
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
