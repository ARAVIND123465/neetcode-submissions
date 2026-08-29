class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                         if (!resultList.contains(nums1[i])) {
                        resultList.add(nums1[i]);
                    }
                    break; 
                }
            }
        }
          int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
         return resultArray; // Works perfectly now!
    }
}