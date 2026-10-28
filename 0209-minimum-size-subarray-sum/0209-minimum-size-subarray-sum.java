class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right =0;
        int CurrentSum = 0;
        int minWindow = Integer.MAX_VALUE;

        for(right=0;right<nums.length;right++){
            CurrentSum +=nums[right];
            while (CurrentSum >= target){
                int CurrentWindow = right - left +1;
                minWindow = Math.min(minWindow,CurrentWindow);

                CurrentSum -= nums[left];
                left++;

            }
        }

        return minWindow == Integer.MAX_VALUE?0:minWindow;

    }
}