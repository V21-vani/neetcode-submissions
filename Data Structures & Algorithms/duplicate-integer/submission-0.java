class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        
            for(int i=0;i<n;i++){
                for(int y=i+1;y<n;y++){
                     if(nums[i]==nums[y]){
                        return true;
                
            } //else{return false;}
                }
           
            }

         return false;
        
    }
}