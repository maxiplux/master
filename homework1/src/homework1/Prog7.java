package homework1;

import java.util.Arrays;

public class Prog7 {
	
	public static void main(String[] args) 
	{

		
		String myInput =  String.join(",", args); 

		System.out.println(String.format("The ansewer to Problem7   question 1  if your enter %s  the  solution is %s",
				myInput, myInput.length()));

		System.out.println(String.format("The ansewer to Problem7   question 2  if your enter %s  the  solution is %s",
				myInput, lengthWithNameA(myInput)));

	}

	private static int lengthWithNameA(String string) {
		int result = 0;
		String[] baseString = string.split(",");

		for (String word : baseString) {
			System.out.println(word);
			
			if (word.toLowerCase().startsWith("a")) {
				result = result + 1;

			}

		}

		return result;

	}
}
