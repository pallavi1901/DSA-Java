public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,22,45};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //find the middle element
    //        int mid = (start+end) / 2;
            //while you take very large value of s and s then it
            // might be possible that (s+e) exceeds range of integer

            int mid = start+(end - start) / 2; //won't exceed integer range

            if(target == arr[mid])
            {
                return mid;
            }
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            if(target > arr[mid])
            {
                start = mid + 1;
            }
        }
        return -1;
    }

}
