public class Swap {

    // Function to swap two numbers
    // Using temporary variable
    static void swapValuesUsingThirdVariable(int m, int n)
    {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
//        System.out.println("Value of m is " + m
//                + " and Value of n is " + n);
    }

    // Main driver code
    public static void main(String[] args)
    {
        // Random integer values
        int m = 9, n = 5;

        // Calling above function to
        // reverse the numbers
        swapValuesUsingThirdVariable(m, n);
        System.out.println("Value of m is " + m+ " and Value of n is " + n);
// here this variable are in main function scope which means m and n in above functions are vanished as there scope ends there
    }
}
