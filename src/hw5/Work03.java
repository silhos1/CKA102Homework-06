package hw5;

// for Ans3.java
public class Work03 {

	private int maxValueI = -1;
	private double maxValueD = -1;

	
	public int maxElement(int x[][]) {
		maxValueI = x[0][0];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				if (x[i][j] > maxValueI)
					maxValueI = x[i][j];
				
			}
		}
		return maxValueI;
		
	}
	

	public double maxElement(double x[][]) {
		maxValueD = x[0][0];
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				
				if (x[i][j] > maxValueD)
					maxValueD = x[i][j];
				
			}
		}
		return maxValueD;

	}

}
