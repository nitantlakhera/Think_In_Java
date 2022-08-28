package nitant.Coding;

public class Factorial {
	
public static void main (String args []) {
	int fact = factorial(5);
	System.out.println(fact);
}

public static int factorial (int number) 
{
	if (number == 0) {
		return 1;
	} else {
		return number * factorial(number - 1);
		}
	}
}
