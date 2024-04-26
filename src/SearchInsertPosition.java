public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int returnInt =0;
        if(nums.length>=1&& nums.length<=10000 && target>-10000&&target<10000) {
            for (int index = 0; index < nums.length; index++) {
                if(nums[index]<-10000||nums[index]>10000)return 0;
                if (nums[index] == target) {
                    returnInt = index;
                } else if (nums[index] < target) {
                    returnInt = index + 1;
                }
            }
        }
    return returnInt;
    }

}

