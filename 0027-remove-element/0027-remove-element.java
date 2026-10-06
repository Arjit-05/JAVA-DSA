class Solution {
    public int removeElement(int[] nums, int val) {
        // int j =0;
        // for (int i = 0; i<nums.length; i++ ){
        //     if (nums[i] != val){
        //         nums[j++] = nums[i];
        //     }
        // }
        // return j;

        int left = 0;
        int right = nums.length -1;

        while(left<=right){
            if(nums[left]==val){
                nums[left] = nums[right];
                right--;
            }
            else{
                left++;
            }
        
        } 
    return right+1;

        
        
    }
}