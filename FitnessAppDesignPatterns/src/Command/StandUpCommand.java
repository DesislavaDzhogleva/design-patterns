package Command;

import Observer.Observable;

public class StandUpCommand implements Command{

	private Observable presenter;
	
	public StandUpCommand(Observable presenter2) {
		this.presenter = presenter2;
	}

	@Override
	public void execute() {
		presenter.setState("Standing up");
	}
}
