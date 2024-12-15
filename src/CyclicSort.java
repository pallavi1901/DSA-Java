import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //when array is given in 1 to N range in continuous manner
    public static void cyclicSort(int[] arr)
    {
        int i=0;
        while(i< arr.length)
        {
            //find the correct index that is value - 1
            int correctIdx = arr[i] - 1;
            if(arr[i] != arr[correctIdx])
            {
                swap(arr, i, correctIdx);
            }
            else
            {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
