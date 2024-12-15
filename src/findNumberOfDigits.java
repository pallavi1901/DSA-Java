

public class findNumberOfDigits {

    public static void main(String[] args) {
        int[] arr = {12,3457,25,65,789};
        System.out.println(findNumbers(arr));;

    }
     public static int findNumbers(int[] arr) {
        int count = 0;

        for(int num: arr)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2==0;
    }

    private static int digits(int num) {

        return (int)(Math.log10(num)+1);
    }
}
