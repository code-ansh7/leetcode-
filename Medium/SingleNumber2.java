class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            boolean visited = false;
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    visited = true;
                    break;
                }
            }
            if(visited) continue;
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                result = nums[i];
            }
        }
        return result;
    }
}
