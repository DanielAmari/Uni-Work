public class TheBeginning {
	public static void main(String[] args) {
		GTerm gt = new GTerm(500, 200);

		/*--String--
		 * I chose to us name as it's keeping it simple in terms of this program. I
		 * don't have to referance a list of different variables to know what prints
		 * name. String is use because there is an undisclosed amount of character used.
		 */
		String userName;// Initialising
		userName = "Nathan";// Giving it text Value
		gt.println("Hey there " + userName + " How are you?"); // Return message greeting

		/*--Integer-- 
		 * I have chosen beerAmount as the integer as it is a quick
		 * description of which of the "beer" based variables pertaining to amount of
		 * beers drank. Integer is used here because the value is a whole number
		 */
		int beerAmount;
		beerAmount = 7;
		beerAmount++;
		gt.println("You've had " + beerAmount + " beers tonight!");

		/*
		 * --Double-- I have two instances of double here for a bit of a change in
		 * formating and output. Again the names are simple to stop confusing between
		 * individual beer cost and overall cost. Double is used as there is a decimal value.
		 */
		double beerCost = 6.57;
		double totalBeerCost = beerAmount * beerCost;
		gt.println(
				"It has costed you " + "$" + beerCost + " for each beer and " + "$" + totalBeerCost + " for the night");

		/*
		 * --Char-- The program is going to auto assign you a nickname based off off the
		 * first letter of your name, using the variable nickName. Char is used because 
		 * the limit of the input is a single character.
		 */
		
		char nickName = userName.charAt(0);
		gt.println("I am going to call you " + nickName + " Dawg");

		/*
		 * --Boolean-- A simple yes or no question, I named it isThatOk because it makes
		 * you think yes or no which makes me think of a boolean. an Integer can be used
		 * instead of using 1=true else=false statements.
		 */
		boolean isThatOk = false;
		gt.println("You have had enough don't you think? " + isThatOk);

		

		userName = gt.getInputString("Hey there! What's your name?");
		beerAmount = Integer.parseInt(gt.getInputString("How many beers did you have tonight?"));
		beerCost = Double.parseDouble(gt.getInputString("How much did each beers cost?"));
		totalBeerCost = beerAmount * beerCost;
		nickName = userName.charAt(0);

		gt.showMessageDialog("Hey " + userName + "!" + " How is your night?" + "\n" + "Wow! You've had " + beerAmount
				+ " beers tonight" + "\n" + "This night has costed you $" + totalBeerCost + "\n"
				+ "Is it cool if I call you " + nickName + " Dawg?");

		
		
		
		
		
		
		gt.showHelp();
	}
}