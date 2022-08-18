// Question: Given two memory units X and Y, exchange them without using extra memory.

package whysopowerful;

public class ExtraCreditTwo {

	public static void main(String[] args) {

		int x = 320;
		int y = -140;

		System.out.println("This is pre-swapped x: " + x + ". This is pre-swapped y: " + y + ".");

		// What I do here is first combine the value of x and y and set that to the new
		// value of x
		x = x + y;

		// Then I subtract the value y from the new value of x and set that value to
		// equal y
		y = x - y;

		// Then I set the second new value of x to equal the new value of y to subtract
		// from the the value of x on line 15
		x = x - y;

		// I use a print line to show the values were swapped and no new variables were
		// created(no extra memory)
		System.out.println("This is post-swapped x: " + x + ". This is post-swapped y: " + y + ".");

	}
}

// Step 1

// Consider two variables x and y. The algorithm to exchange these two variables
// without using extra memory or an extra variable is:

// 1. Start
// 2. Initialise two variables x and y
// 3. Enter the values of x and y
// 4. Print the values of x and y
// 5. x=x+y
// 6. y=x-y
// 7. x=x-y
// 8. Print the final values of x and y
// 9. End

// Step 2

// Conclusion:

// By using Arithmetic operations addition and subtraction the two values are
// exchanged without use of any extra variable.