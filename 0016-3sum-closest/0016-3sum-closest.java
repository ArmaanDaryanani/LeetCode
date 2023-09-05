class Solution {
    public int threeSumClosest(int[] nums, int target)
    {
        //Achieve fastest runtime using the two pointer technique
        //Sorts the array
        Arrays.sort(nums);
        
        //Closest is initialized to the first three elements
        int closest = nums[0] + nums[1] + nums[2];
        
        
        for(int i = 0; i < nums.length - 2; i++)
        {
            //Initialize both pointers to left and right of array
            int left = i + 1;
            int right = nums.length - 1;
            
            //Pointers are apart...
            while(left < right)
            {
                
                int currentSum = nums[i] + nums[left] + nums[right];
                
                //If current pointer difference < initial difference, set new closest val
                if(Math.abs(currentSum - target) < Math.abs(closest - target))
                {
                    closest = currentSum;
                }
                
                //Adjusting pointers
                if(currentSum < target)
                {
                    //If sum < target, to get closer, make next sum bigger
                    left++;
                }
                else if(currentSum > target)
                {
                    //If sum < target, to get closer, make next sum smaller
                    right--;
                }
                else 
                {
                    //if currentSum == target, return target
                    return target;
                }
            }
        }
        return closest;
    }
}