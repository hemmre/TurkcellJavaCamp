package Instagram;

public class Home {

	private User[] user;
	private Post[] posts;
	private Reels[] reels;
	private Story[] stories;
	private Store[] shopping;
	private DirectMessage[] directMessage;
	
	public Home() {
		super();
	}

	public Home(User[] user, Post[] posts, Reels[] reels, Story[] stories, Store[] shopping,
			DirectMessage[] directMessage) {
		super();
		this.user = user;
		this.posts = posts;
		this.reels = reels;
		this.stories = stories;
		this.shopping = shopping;
		this.directMessage = directMessage;
	}

	public User[] getUser() {
		return user;
	}

	public void setUser(User[] user) {
		this.user = user;
	}

	public Post[] getPosts() {
		return posts;
	}

	public void setPosts(Post[] posts) {
		this.posts = posts;
	}

	public Reels[] getReels() {
		return reels;
	}

	public void setReels(Reels[] reels) {
		this.reels = reels;
	}

	public Story[] getStories() {
		return stories;
	}

	public void setStories(Story[] stories) {
		this.stories = stories;
	}

	public Store[] getShopping() {
		return shopping;
	}

	public void setShopping(Store[] shopping) {
		this.shopping = shopping;
	}

	public DirectMessage[] getDirectMessage() {
		return directMessage;
	}

	public void setDirectMessage(DirectMessage[] directMessage) {
		this.directMessage = directMessage;
	}
	
}
