package observer;

public class YoutubeApp implements Iobserver {

	private YoutubeChannel channel;

	public YoutubeApp(YoutubeChannel ch) {
		// TODO Auto-generated constructor stub
		this.channel = ch;
	}

	@Override
	public void updateObserver() {
		// TODO Auto-generated method stub
		System.out.println("Youtube App: got an update!"
				+ " New Video: " + this.channel.getVideo());
	}

}
