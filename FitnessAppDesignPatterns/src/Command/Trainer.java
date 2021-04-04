package Command;

public class Trainer {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
		this.command.execute();
	}
	
	public void setComMmand() {
		this.command.execute();
	}
	
}
