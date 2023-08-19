class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] sol = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 1; j < nums.length; j++)
            {
                int total = nums[i] + nums[j];
                if(i != j)
                {
                    if(total == target)
                    {
                       sol[0] = i;
                       sol[1] = j;
                       return sol;
                    }
                }
                
            }
            
        }
        return sol;
    }
}