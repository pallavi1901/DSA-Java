import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;              //expected output [3,4]

        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        //ans[0] = start;
        //ans[1] = end;

        return ans;

    }

    //this function just return the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex)
    {
        int ans = -1;    //initially

        int start = 0;
        int end = nums.length - 1;

        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = start + 1;
            }
            else
            {
                ans = mid;               //got first occurence of target
                if(findStartIndex)
                {
                    end = end - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
