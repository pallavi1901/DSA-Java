public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target)
    {
        //but what if the target is greater than the greatest number in array
        if(target > arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return start;
    }

}
