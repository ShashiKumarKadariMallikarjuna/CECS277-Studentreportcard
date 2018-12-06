package assignment4p1;
/**Describes the grading scheme
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 1
 * @since Due: 10/15/18
 */
public class Grade {
	private String grade;
	private String classs;
	/**constructor that initializes the values*/
	public Grade() {
		grade="";
		classs="";
	}
	/**Constructor overloading
	 * @param grade the grade which needs to updated with
	 * @param classs the class that needs to be updated with
	 */
	public Grade(String grade,String classs) {
		this.grade=grade;
		this.classs=classs;
	}
	/**method that gets the class
	 * @return class of the student
	 */
	public String getClasss() {
		return classs;
	}
	/**method that updates the class
	 * @param classs new class of the student
	 */
	public void setClasss(String classs) {
		this.classs=classs;
	}
	/**method that gets the grade of the student
	 * @return grade in a class
	 */
	public String getGrade() {
		return grade;
	}
	/**calculates and returns the grade point based on the grade
	 * @return grade point
	 */
	public int Gradepoints() {
		if(grade.equals("A")) {
			return 4;
		}
		else if(grade.equals("B")) {
			return 3;
		}
		else if(grade.equals("C")) {
			return 2;
		}
		else if(grade.equals("D")){
			return 1;
		}
		else {
			return 0;
		}
	}
}
