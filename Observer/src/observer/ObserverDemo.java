package observer;

public class ObserverDemo {
	public static void main(String[] args) {
		YoutubeChannel ytc = new YoutubeChannel("My Vlog To Sinnar!");
		YoutubeApp yta = new YoutubeApp(ytc);
		YoutubeApp yta2 = new YoutubeApp(ytc);

		// adding observers objects here (yta) -> is a youtube app or a subscriber to
		// notify them with the same message
		ytc.add(yta);
		ytc.add(yta2);

		ytc.setVideo("My Vlog To Madni!");
	}
}
