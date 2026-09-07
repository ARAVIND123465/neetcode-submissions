class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        int[] count = new int[nums.length+1];
        for(int num : nums){
              count[num] = 1;
        }
        for( int index=1;index<count.length;index++){
                 if(count[index] == 0){
                      res = index;
                 }
        }
        return res;
    }
}
