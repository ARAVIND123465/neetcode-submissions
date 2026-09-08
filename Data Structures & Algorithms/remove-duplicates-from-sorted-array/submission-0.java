class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> res = new TreeSet<>();
           for(int num : nums){
                res.add(num);
           }
        int i=0;
        for(int num : res){
               nums[i++]= num;
        }
           return res.size();

    }
}