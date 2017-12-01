
public class Demo {

	public static void main(String[] args) {
		GradeBag gradeBag = new GradeBag(10);
		gradeBag.importData();
		gradeBag.display();
		CourseBag courseBag = new CourseBag(10);
		courseBag.importData();
		courseBag.display();
		
		GPACalculator gpaCalculator = new GPACalculator();
		double gpa = gpaCalculator.calculateGPA(gradeBag.getGradeArray(), courseBag);
		System.out.printf("The GPA is %.2f", gpa);
	}

}
