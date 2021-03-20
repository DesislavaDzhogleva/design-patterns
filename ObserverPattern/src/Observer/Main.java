package Observer;

public class Main {

	public static void main(String[] args) {
		Observable instructor = new Instructor();
		
		Observer firstViewer = new Viewer("Diana", instructor);
		Observer secondViewer = new Viewer("Todor", instructor);
		Observer thirdViewer = new Viewer("Stamat", instructor);
		
		System.out.println("All participants doing first exercise: ");
		instructor.setExercise("jumping");
		System.out.println("All participants doing second exercise: ");
		instructor.setExercise("squats");

	}

}
