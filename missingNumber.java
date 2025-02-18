class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==s){
                s++;
            }
            else{
                return s;
            }
        }
        return s;
    }
}