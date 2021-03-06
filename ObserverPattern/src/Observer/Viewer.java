package Observer;

public class Viewer implements Observer {

	private String name;
	private Observable instructor;
	
	public Viewer(String name, Observable instructor) {
		this.name = name;
		this.instructor = instructor;
		this.instructor.subscribe(this);
	}
	
	@Override
	public void update() {
		System.out.println(this.getName() + " doing " + this.instructor.getExercise());

	}
	
	public String getName() {
		return this.name;
	}
}
