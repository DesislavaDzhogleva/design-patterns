package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Command.Command;
import Command.LieDownCommand;
import Command.StandUpCommand;
import Command.Trainer;
import Observer.Observable;
import Observer.Observer;
import Observer.Presenter;
import Observer.Viewer;

public class Main {

	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Observable presenter = new Presenter();
		Observer firstViewer = new Viewer("Diana");
		Observer secondViewer = new Viewer("Todor");
		Observer thirdViewer = new Viewer("Stamat");
		
		presenter.subscribe(firstViewer);
		presenter.subscribe(secondViewer);
		presenter.subscribe(thirdViewer);
		
		Command standUpCommand = new StandUpCommand(presenter);
		Command lieDownCommand = new LieDownCommand(presenter);
		
		trainer.setCommand(standUpCommand);
		trainer.setCommand(lieDownCommand);
		
		presenter.unsubscribe(firstViewer);
		trainer.setCommand(standUpCommand);

	}

}
