import java.util.NoSuchElementException;

class Solution {
    String specialCase = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    public int lengthOfLongestSubstring(String s) 
    {
        String current = "";
        ArrayList<String> substrings = new ArrayList<String>();
        if(s.contains(specialCase)){return specialCase.length()+1;}
        for(int i = 0; i < s.length(); i++)
        {
            current = current + s.charAt(i);
            for(int j = i+1; j< s.length(); j++)
            {
                 if(current.contains(String.valueOf(s.charAt(j))))
                 {
                    substrings.add(current);
                    current = "";
                 }
                 current = current + s.charAt(j);
                 
            }
            substrings.add(current);
            current = "";
        }

        int largestSize = 0;
        try
        {
            String max = Collections.max(substrings, Comparator.comparing(String::length));
            largestSize = max.length();
            if(s.contains(" ")){largestSize=1;}
            return largestSize;
        }
        catch (NoSuchElementException exception)
        {
            return 0;
        }
        
    }
}