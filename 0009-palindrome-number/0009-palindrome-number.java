class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverse = 0;

        while (x>0) {
            int lastdigit = x%10;
            reverse = reverse * 10 + lastdigit;
            x = x / 10;
        
        }

        if (original == reverse) {
            return true;
        }
        else{
            return false;
        }



    }
}