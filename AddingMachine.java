/*
 * Name: Uiseong Sang
 * Class ID: 85141
 * File: AddingMachine.java
 * Date: 10/09/19
 * Assignment number: #2
 * Description: Using a version control system.
 *              Also, it is with Javadoc
 */

package cse360assign2;

/*
 * Description: This class is adding and subtracting number
 *              
 */
public class AddingMachine {
	private int total;
	private String history;
	
	/*
	 * purpose: Conductor
	 * 			initialized every variable
	 */
	public AddingMachine () {
		total = 0; 
		history = "0";
	}
	
	/*
	 * purpose: to get total number.
	 * 
	 *  @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/*
	 * purpose: to add number to total variable.
	 * 
	 * param value: integer number for addition
	 */
	public void add (int value) {
		total = total +value;
		history = history.concat(" + " + value);
	}
	
	/*
	 * purpose: to subtract number from total variable.
	 * 
	 * @param  value: integer number for subtract.
	 */
	public void subtract (int value) {
		history = history.concat(" - " + value);
		total = total - value;
	}
	
	
	/*
	 * purpose: To display outputs.
	 * 			string representation of the object.
	 * 
	 * @return  history
	 */
	public String toString () {
		return  history;
	}
}
