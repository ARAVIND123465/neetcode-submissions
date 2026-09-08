class Solution {
    public int removeDuplicates(int[] nums) {
        // TreeSet<Integer> res = new TreeSet<>();
        //    for(int num : nums){
        //         res.add(num);
        //    }
        // int i=0;
        // for(int num : res){
        //        nums[i++]= num;
        // }
        //    return res.size();
        int i=0;
        for(int j=1;j<nums.length;j++){
               if(nums[i] != nums[j]){
                    i++;
                    nums[i] = nums[j];
               }
        }
        return i+1;

    }
}