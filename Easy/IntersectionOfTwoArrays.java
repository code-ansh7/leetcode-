class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n3 = Math.min(nums1.length,nums2.length);
        int[] nums3 = new int[n3];
        int pos = 0;
        for(int i = 0; i < nums1.length; i++){
            boolean visited = false;
            for(int j = 0; j < i; j++){
                if(nums1[i] == nums1[j]){
                    visited = true;
                    break;
                }
            }
            if(visited) continue;
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    nums3[pos] = nums1[i];
                    pos++;
                    break;
                }
            }
        }
        int[] ans = new int[pos];
        for(int i = 0; i < pos; i++){
            ans[i] = nums3[i];
        }   
        return ans;
    }
}
