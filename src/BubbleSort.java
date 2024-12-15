import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr)
    {
        boolean swapped;
        //run the steps for n-1 times
        for(int i=0; i<arr.length; i++)
        {
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++)
            {
                //swap if the item greater than the next item
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            //if you didn't swap for a particular value of i, it means the array is sorted hence stop the program
                if(!swapped)
                {
                    break;
                }
        }

    }


}
