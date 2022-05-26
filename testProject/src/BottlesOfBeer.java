
public class BottlesOfBeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numBottles = 99; // number of times to sing the song
		String word = " bottles"; // since there are more than one bottle, use the plural
		
		while (numBottles > 0) {

			if (numBottles == 1) {
				word = " bottle"; // when only one bottle remains, use the singular
			}

			System.out.println(numBottles + word + " of beer on the wall");
			System.out.println(numBottles + word + " of beer on the wall");
			System.out.println(numBottles + word + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			System.out.println();
			
			numBottles = numBottles - 1; // decrement the number of bottles

		} // end of while loop
		
	} // end of main method

} // end of BottlesOfBeer class
