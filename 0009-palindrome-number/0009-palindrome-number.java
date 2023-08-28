class Solution {
    public boolean isPalindrome(int x) 
    {
        String str = String.valueOf(x);
        String strComp = "";
        for(int i = str.length(); i > 0; i--)
        {
            strComp += str.substring(i - 1, i);
        }
        if(strComp.equals(str))
        {
            return true;
        }
        return false;

    }
}