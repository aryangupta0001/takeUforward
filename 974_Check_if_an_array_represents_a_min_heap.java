class Solution {
    public boolean isHeap(int[] nums) {

        int i = 0;

        while(true){
            if(2*i + 1 < nums.length){
                if(nums[i] > nums[2*i + 1])
                    return false;
                
                if(2*i + 2 < nums.length){
                    if(nums[i] > nums[2*i + 2])
                        return false;
                }
                else
                    break;
                
                i++;
            }                

            else
                break;
        }

        return true;
    }
}
