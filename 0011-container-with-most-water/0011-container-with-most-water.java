class Solution {
    public int maxArea(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int maxVal = 0;
        
        while(left < right)
        {
            maxVal = Math.max(maxVal, Math.min(height[right],height[left]) * (right - left));
            
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxVal;
    }
}