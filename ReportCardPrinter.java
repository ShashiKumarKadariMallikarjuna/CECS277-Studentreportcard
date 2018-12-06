package assignment4p1;
/**prints the report card of a student
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 1
 * @since Due: 10/15/18
 */
public class ReportCardPrinter {
	public static void main(String []args) {
		studentDetails sd=new studentDetails("Ashish","Gare","015092338");
		StudentReportCard GareReport=new StudentReportCard(sd);
		GareReport.add(new Grade("A","History 173"));
		GareReport.add(new Grade("A","Physics 152"));
		GareReport.add(new Grade("A","CECS 174"));
		GareReport.add(new Grade("C","CECS 274"));
		GareReport.add(new Grade("A","English 100"));
		System.out.println(GareReport.format());
	}
}
