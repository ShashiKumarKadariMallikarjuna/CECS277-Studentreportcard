package assignment4p1;
/**Describes the details of the student
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 1
 * @since Due: 10/15/18
 */
public class studentDetails {
	private String fname;
	private String lname;
	private String ID;
	/**Constructor to initialize the details of the student */
	public studentDetails() {
		fname="";
		lname="";
		ID="";
	}
	/**Overloaded constructor which assigns the student details
	 * @param fname student's first name
	 * @param lname student's last name
	 * @param ID Student's ID number
	 */
	public studentDetails(String fname, String lname, String ID) {
		this.fname=fname;
		this.lname=lname;
		this.ID=ID;
	}
	/**method that updates the first name with a different first name
	 * @param fn first name
	 */
	public void setfn(String fn) {
		fname=fn;
	}
	/**method that updates the last name with a different last name
	 * @param ln last name
	 */
	public void setln(String ln) {
		lname=ln;
	}
	/**method that updates the ID with a different ID
	 * @param ID new ID number
	 */
	public void setID(String ID) {
		this.ID=ID;
	}
	/**method that gets the first name
	 * @return first name
	 */
	public String getfn() {
		return fname;
	}
	/**method that gets the last name
	 * @return last name
	 */
	public String getln() {
		return lname;
	}
	/**method that returns the ID number
	 * @return ID number
	 */
	public String getID() {
		return ID;
	}
	/**formats the student details 
	 * @return the student name and ID number
	 */
	public String format() {
		return "Student Name: "+fname+" "+lname+"\nStudent ID: "+ID;
	}
}
