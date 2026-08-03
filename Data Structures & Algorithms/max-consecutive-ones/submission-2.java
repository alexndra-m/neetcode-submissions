class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // if nums[i] = 1; count +1
        // else if nums[i] = 0; nums[i] + 1
     int n = nums.length, result = 0; 
     for (int i = 0; i < n; i++) {
        int count = 0; 
        for (int j = i; j < n; j++) {
            if (nums[j] == 0) break;
            count++;
        }
        result = Math.max(result, count);
     }
return result; 
}
}