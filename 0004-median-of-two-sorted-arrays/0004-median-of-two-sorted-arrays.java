class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) 
            {
                mergedArray[k++] = nums1[i++];
            } 
            else 
            {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) 
        {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) 
        {
            mergedArray[k++] = nums2[j++];
        }

        //median
        if (mergedArray.length % 2 == 0) 
        { 
        //even length
        int mid1 = mergedArray.length / 2 - 1;
        int mid2 = mergedArray.length / 2;
        return (mergedArray[mid1] + mergedArray[mid2]) / 2.0;
        } 
        else 
        { 
        //odd length
        int mid = mergedArray.length / 2;
        return mergedArray[mid];
        }
        
    }
}