public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

        public static int missingNumber(int[] nums) {
            int i = 0;
            while(i<nums.length)
            {
                if(nums[i]<nums.length && nums[i] != nums[nums[i]])
                {
                    swap(nums, i, nums[i]);
                }
                else
                {
                    i++;
                }
            }

            for(int index=0; index < nums.length; index++)
            {
                if(nums[index] != index)
                {
                    return index;
                }
            }
            return nums.length;
        }

        public static void swap(int[] nums, int first, int second)
        {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }

}
