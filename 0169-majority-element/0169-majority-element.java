class Solution {
    public int majorityElement(int[] nums) {
        int value = 0;
        int count = 0;

        for(int x : nums){
            if(count == 0){
                value = x;
            }

            if(x == value){
                count++;
            }
            else{
                count--;
            }
            
        }
        return value;


    }
}