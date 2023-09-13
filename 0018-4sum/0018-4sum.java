class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) 
        {
            return res;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) 
        {
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;  //skip duplicate numbers
            }

            for (int j = i + 1; j < nums.length - 2; j++) 
            {
                if (j > i + 1 && nums[j] == nums[j - 1]) 
                {
                    continue;  //skip duplicate numbers
                }

                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) 
                {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) 
                    {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) 
                        {
                            left++;  //skip duplicates
                        }

                        while (left < right && nums[right] == nums[right - 1]) 
                        {
                            right--;  //skip duplicates
                        }

                        left++;
                        right--;
                    } else if (sum < target) 
                    {
                        left++;
                    } else 
                    {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}