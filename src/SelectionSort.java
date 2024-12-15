import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
            int[] arr = {2,4,5,1,0};
            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            //find the max item in the remaining array and swap with correct index
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr, 0, last);

            //swap max index with last index
            swap(arr,maxIndex,last);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;

        for (int i = 0; i <=end; i++) {
            if(arr[max] < arr[i])
            {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
