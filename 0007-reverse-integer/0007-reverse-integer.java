class Solution {
    public int reverse(int x) 
    {
        try
        {
            String numString = Integer.toString(x);
        String finalNumString = "";
        boolean isNeg = false;
        
        for(int i = numString.length() - 1; i >= 0; i--)
        {
            if(numString.charAt(i) == '-')
            {
                isNeg = true;
                continue;
            }
            finalNumString += numString.charAt(i);
        }

        int i = Integer.parseInt(finalNumString);

        if(isNeg)
        {
            
            return i*-1;
        }
        return i;
        }
        catch (NumberFormatException e1)
        {
            return 0;
        }
        
    }
}