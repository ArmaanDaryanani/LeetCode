class Solution 
{
    //Output list
    ArrayList<String> output = new ArrayList<>();

    //Defined static Mapping for memory and runtime efficiency
    static final Map<Character, String> map = new HashMap<>();
    static 
    {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }
    
    public List<String> letterCombinations(String digits) 
    {
        //If list is empty
        if(digits.isEmpty())
        {
            return List.of();
        }
        
        //Recursive method call
        combos(new StringBuilder(), digits, 0);

        //Return list
        return output;
    }

    //StringBuilder modifies existing object on recursion rather
    //than string concatenation which creates new string objects
    //each time. Passing index(rather than substring modification)
    //elimates extra object creation(for substring case)
    public void combos(StringBuilder combo, String digits, int index)
    {
        //if end of combination is reached, add to output list
        if (index == digits.length())
        {
            output.add(combo.toString());
            return;
        }
        //String object for current mapping
        String str = map.get(digits.charAt(index));
        //char iteration
        for (char ch : str.toCharArray())
        {
            //append to running combination
            combo.append(ch);  
            //increment index and run method again
            combos(combo, digits, index + 1);
            //for backtracking process
            combo.deleteCharAt(combo.length() - 1);  
        }
    }
    //The following recursive algorithm has been optimizied
    //for low memory and runtime-intensive applications.
    







}