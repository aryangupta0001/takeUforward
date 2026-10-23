class Solution {
    public void buildMinHeap(int[] nums) {

        for(int i = 1; i<nums.length; i++)
            if(nums[i] < nums[(i-1) / 2])
                heapify(nums, i);
    }

    public static void heapify(int[] nums, int i){
        int temp = nums[(i-1) / 2];
        nums[(i-1) / 2] = nums[i];
        nums[i] = temp;

        if((i-1)/2 == 0)
            return;
        
        else{
            int j = (i-1) / 2;
            
            if(nums[j] < nums[(j-1) / 2])
                heapify(nums, j);
            
            else
                return;
        }
    }
}
