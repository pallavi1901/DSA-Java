public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,15,16,22,45};
//        int target = 22;
        int[] arr = {90, 80, 55, 33, 22, 10,9};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start]<arr[end];

//        if(arr[start]<arr[end])
//        {
//            isAsc =true;
//        }
//        else{
//            isAsc = false;
//        }

        while(start <= end)
        {
            //find the middle element
            // int mid = (start+end) / 2  might be possible that (s+e) exceeds range of integer

            int mid = start+(end - start) / 2; //won't exceed integer range

            if(target == arr[mid])
            {
                return mid;
            }

            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

}
