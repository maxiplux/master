package homework1;

public class Prog4 {

	public static void main(String[] args) {
		String intialquestion = "Hello";

		System.out.println(String.format("The ansewer to Problem4  if your enter %s  the  solution is %s",
				intialquestion, reverseString(intialquestion)));

	}

	private static String reverseString(String string) {
		String result = "";
		char[] baseString = string.toCharArray();
		for (int i = baseString.length - 1; i != -1; i--) {
			result = result + baseString[i];

		}
		return result;

	}
}
