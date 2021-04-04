package Observer;

import java.util.ArrayList;
import java.util.List;

public class Presenter implements Observable {

	private List<Observer> viewers;
	//private boolean isStandingUp = false;
	private String exercise;
	
	public Presenter() {
		this.viewers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer viewer) {
		this.viewers.add(viewer);

	}

	@Override
	public void unsubscribe(Observer viewer) {
		this.viewers.remove(viewer);

	}

	@Override
	public void notifyObservers() {
		for (Observer viewer : this.viewers) {
			viewer.update(this);
		}

	}

	@Override
	public String getState() {
		return this.exercise;
	}

	@Override
	public void setState(String exercise) {
		this.exercise = exercise;
		this.notifyObservers();
		
	}


}
