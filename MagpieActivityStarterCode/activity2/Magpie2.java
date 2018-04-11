activity 2
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that: 
 * <ul><li>
 * Uses indexOf to find strings
 * </li><li>
 * Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	* Get a default greeting 
	* @return a greeting
	*/
	public String getGreeting()
	{
	return "Hello, let's talk.";
	}
	
	/**
	* Gives a response to a user statement
	* 
	* @param statement
	* the user statement
	* @return a response based on the rules given
	*/
	public String getResponse(String statement)
	{
	String response = "";
	if (statement.indexOf("no") >= 0)
	{
	response = "Why so negative?";
	}
	else if (statement.indexOf("mother") >= 0
 || statement.indexOf("father") >= 0
 || statement.indexOf("sister") >= 0
 || statement.indexOf("brother") >= 0)
 {
 response = "Tell me more about your family.";
 }
	else if (statement.indexOf("dog") >= 0
 || statement.indexOf("cat")>=0)
 response = "Tell me more about your pets.";
 /**
 * Java responds to the first keyword when there 
 * are more than keywords in the statement
 */
 
 /**
 * respond favorably when it sees the name of your teacher.
 */
 else if (statement.indexOf("Mr") >= 0 
 || statement.indexOf("Mrs") >= 0
 || statement.indexOf("Ms") >= 0)
 {
 if (statement.indexOf("Mr") >= 0)
 {
 response = "He sounds like a good teacher";
 }
 if (statement.indexOf("Mrs") >= 0
 || statement.indexOf("Ms") >= 0)
 {
 response = "She sounds like a good teacher";
 }
 }
 /**
 * Three more keywords with responses
 */
 else if (statement.indexOf("Tom") >= 0)
 {
 response = "I also have a friend name Tom!";
 }
 else if (statement.indexOf("car") >= 0)
 {
 response = "What car brand?";
 }
 else if (statement.indexOf("chicken") >= 0)
 {
 response = "I do like eating chicken!";
 }
 /**
 * trim() method
 */
 else if (statement.trim().length() == 0)
 response = "Say something, please.";
 
 else
 {
 response = getRandomResponse();
 }
 return response;
 }

 /**
 * Pick a default response to use if nothing else fits.
 * @return a non-committal string
 */
 private String getRandomResponse()
 {
 final int NUMBER_OF_RESPONSES = 6;
 double r = Math.random();
 int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
 String response = "";
 
 if (whichResponse == 0)
 {
 response = "Interesting, tell me more.";
 }
 else if (whichResponse == 1)
 {
 response = "Hmmm.";
 }
 else if (whichResponse == 2)
 {
 response = "Do you really think so?";
 }
 else if (whichResponse == 3)
 {
 response = "You don't say.";
 }
 /**
 * two more non-committal String
 */
 else if (whichResponse == 4) {
 response = "Say something fun";
 }
 
 else if (whichResponse == 5) {
 response = "Lol.";
 }

 return response;
 }
}
