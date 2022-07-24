package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements IObservable {
	private List<Iobserver> observers;
	private String video;

	public YoutubeChannel(String latestVid) {
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<>();
		this.video = latestVid;
		System.out.println("Youtube Channel: Latest Video: " + latestVid);
	}

	@Override
	public void add(Iobserver ob) {
		// TODO Auto-generated method stub
		this.observers.add(ob);
	}

	@Override
	public void remove(Iobserver ob) {
		// TODO Auto-generated method stub
		this.observers.remove(ob);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Iobserver o : this.observers) {
			o.updateObserver();
		}
	}
	public String getVideo() {
		return video;
	}

	public void setVideo(String newVid) {
		this.video = newVid;
		System.out.println("Youtube Channel: new video Uploaded. notifying users..");
		notifyObservers();
	}
}