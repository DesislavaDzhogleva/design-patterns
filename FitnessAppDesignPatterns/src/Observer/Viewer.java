package Observer;

public class Viewer implements Observer{

	private String name;
	private String exercise;
	
	public Viewer(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o) {
		exercise = o.getState();
		System.out.println(this.getName() + " doing exercise " + this.exercise);
	}
	
	public String getName() {
		return this.name;
	}
}


