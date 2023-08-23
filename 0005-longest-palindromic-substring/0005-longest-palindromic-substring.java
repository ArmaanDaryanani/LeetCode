class Solution {
    public String longestPalindrome(String s) 
    {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            //odd length
            int l1 = i, r1 = i;
            while (l1 >= 0 && r1 < s.length() && s.charAt(l1) == s.charAt(r1)) 
            {
                l1--;
                r1++;
            }

            //even length
            int l2 = i, r2 = i + 1;
            while (l2 >= 0 && r2 < s.length() && s.charAt(l2) == s.charAt(r2)) 
            {
                l2--;
                r2++;
            }

            int len1 = r1 - l1 - 1;
            int len2 = r2 - l2 - 1;

            if (len1 > end - start) 
            {
                start = l1 + 1;
                end = r1 - 1;
            }
            if (len2 > end - start)
            {
                start = l2 + 1;
                end = r2 - 1;
            }
        }

        return s.substring(start, end + 1);
    }
}
