package assignment4p1;
/**formats the grade, class and grade points
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 1
 * @since Due: 10/15/18
 */
public class LineItem {
	private Grade theGrade;
	/**constructor that initializes the variables*/
	public LineItem() {
		theGrade=new Grade();
	}
	/**overloaded constructor
	 * @param aGrade the grade that needs to be updated with
	 */
	public LineItem(Grade aGrade) {
		theGrade=aGrade;
	}	
	/**formats the string
	 * @return formatted string
	 */
	public String format() {
		return String.format("%-30s%-8s%13d", theGrade.getClasss(),theGrade.getGrade(),theGrade.Gradepoints());
	}
}
