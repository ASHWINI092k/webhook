public class add {

    // This function takes two integers as input and returns their sum
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 25;
	int res = number1 * number2;
	System.out.println("The product of " + number1 + " and " + number2 + " is: " + res);

        // Call the addNumbers function and store the result
        int result = addNumbers(number1, number2);

        // Print the result
	System.out.println("Addition program.....");
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
