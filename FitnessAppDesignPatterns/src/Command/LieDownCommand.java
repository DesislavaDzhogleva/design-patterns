package Command;

import Observer.Observable;

public class LieDownCommand implements Command{

	private Observable presenter;
	
	public LieDownCommand(Observable presenter) {
		this.presenter = presenter;
	}

	@Override
	public void execute() {
		presenter.setState("Lying down");
	}
}
