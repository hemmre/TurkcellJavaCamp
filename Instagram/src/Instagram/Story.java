package Instagram;

public class Story extends Share {
	
	private String storyImage;
	private String storyDescription;
	private int seenCount;
	
	public Story() {
		super();
	}

	public Story(int id, String userName, double time, String storyImage, String storyDescription, int seenCount) {
		super(id, userName, time);
		this.storyImage = storyImage;
		this.storyDescription = storyDescription;
		this.seenCount = seenCount;
	}

	public String getStoryImage() {
		return storyImage;
	}

	public void setStoryImage(String storyImage) {
		this.storyImage = storyImage;
	}

	public String getStoryDescription() {
		return storyDescription;
	}

	public void setStoryDescription(String storyDescription) {
		this.storyDescription = storyDescription;
	}

	public int getSeenCount() {
		return seenCount;
	}

	public void setSeenCount(int seenCount) {
		this.seenCount = seenCount;
	}

}
