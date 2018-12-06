package assignment4p1;
import java.util.*;
/**class that creates the student report card
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 1
 * @since Due: 10/15/18
 */
public class StudentReportCard {
	private studentDetails sd;
	double count,total=0;
	private ArrayList <LineItem> item= new ArrayList<LineItem>();
	/**Overloaded constructor
	 * @param s the student details
	 */
	public StudentReportCard(studentDetails s) {
		sd=s;
	}
	/**method that adds the grade to the report card
	 * @param aGrade grade of a student in a class
	 */
	public void add(Grade aGrade) {
		LineItem anItem=new LineItem(aGrade);
		total+=aGrade.Gradepoints();
		item.add(anItem);
	}
	/**method that calculates the average grade point of a student
	 * @return average grade point
	 */
	public double pointAvg() {	
		return total/item.size();
	}
	/**method that formats the report card
	 * @return formatted report card
	 */
	public String format() {
		String r="                          Student Report Card\n\n"+sd.format()+String.format("\n\n%-27s%-15s%10s\n","Class","Grade","Grade points");
		for (LineItem items:item) {
			r=r+items.format()+"\n";
		}
		r= r+"\nAverage Grade Point: "+Double.toString(pointAvg());
		return r;
	}
}
