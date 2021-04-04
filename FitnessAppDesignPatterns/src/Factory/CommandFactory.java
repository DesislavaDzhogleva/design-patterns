package Factory;

import Command.Command;
import Command.LieDownCommand;
import Command.StandUpCommand;
import Observer.Presenter;

public class CommandFactory {

	public Command getCommand(String command, Presenter presenter) {
		switch( command ) {
			case "standUp": 
				return new StandUpCommand(presenter);
			case "lieDown": 
				return new LieDownCommand(presenter);
		}
		return null;
	}
}
