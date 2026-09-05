class Solution {
    public void moveZeroes(int[] nums) {
      int len = 0;
      for(int r =0;r< nums.length;r++){
            if(nums[r] != 0){
                   int temp = nums[len];
                   nums[len] = nums[r];
                   nums[r] = temp;
                   len++;
            }
      }
    }
}