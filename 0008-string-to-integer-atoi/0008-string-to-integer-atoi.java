class Solution {
    public int myAtoi(String s) 
    {
        ArrayList<Integer> myInt = new ArrayList<Integer>();
        boolean hasNegative = false;

        out: for(int i = 0; i < s.length(); i++)
        {
            String chString = String.valueOf(s.charAt(i));

            if(chString.equals("."))
            {
                break out;
            }
            if(chString.equals(" "))
            {
                if(myInt.size()!=0)
                {
                    break out;
                }
                continue;
            }
            if(chString.equals("+"))
            {
                try
                {
                    if(myInt.size()!=0)
                    {
                        break out;
                    }
                    if(String.valueOf(s.charAt(i+1)).equals("-"))
                    {
                        break out;
                    }
                    if(String.valueOf(s.charAt(i+1)).equals("+"))
                    {
                        return 0;
                    }
                    if(String.valueOf(s.charAt(i+1)).equals(" "))
                    {
                        return 0;
                    }
                }
                catch (StringIndexOutOfBoundsException exc)
                {
                    continue;
                }
                if(myInt.size()!=0)
                {
                    break out;
                }
                continue;
            }
            try
            {
                if(chString.equals("-"))
                {
                    
                    try
                    {
                        if(String.valueOf(s.charAt(i+1)).equals("+"))
                        {
                            return 0;
                        }
                        if(String.valueOf(s.charAt(i+1)).equals("-"))
                        {
                            return 0;
                        }
                        if(String.valueOf(s.charAt(i+1)).equals(" "))
                        {
                            return 0;
                        }
                    }
                    catch (StringIndexOutOfBoundsException exce)
                    {
                        if(myInt.size()!=0 && !hasNegative)
                        {
                            break out;
                        }   
                        hasNegative = true;
                        continue;
                    }
                    
                    if(myInt.size()!=0)
                    {
                        hasNegative = false;
                        break out;
                    }
                    hasNegative = true;
                    continue;
                }
                
                myInt.add(Integer.parseInt(chString));
            }
            catch(NumberFormatException e)
            {
                break out;
            }

        }

        String fString = "";
        for(int i : myInt)
        {
            fString += Integer.toString(i);
        }
        if(myInt.size() == 0)
        {
            return 0;
        }

        long comp1 = 2147483647;
        long holding = 0;
        try
        {
            holding = Long.parseLong(fString);

        }
        catch (NumberFormatException toolong)
        {
            if(hasNegative)
            {
                return -2147483648;
            }
            return 2147483647;
        }
        
        try
        {
            
            System.out.println(holding);

            if(hasNegative)
            {
                return Integer.parseInt(fString) * -1;
            }
            return Integer.parseInt(fString);
        }
        catch(NumberFormatException ex)
        {
            if(fString.length() >= 10 && holding > comp1 &&hasNegative)
            {
                return -2147483648;
            }
            return 2147483647;
        }
    }
}