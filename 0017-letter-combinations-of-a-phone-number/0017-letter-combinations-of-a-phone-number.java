class Solution 
{
    ArrayList<String> output = new ArrayList<>();
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
        if(digits.isEmpty())
        {
            return List.of();
        }
        
        combos(new StringBuilder(), digits, 0);
        return output;
    }
    public void combos(StringBuilder combo, String digits, int index)
    {
        if (index == digits.length())
        {
            output.add(combo.toString());
            return;
        }
        String str = map.get(digits.charAt(index));
        for (char ch : str.toCharArray())
        {
            combo.append(ch);  
            combos(combo, digits, index + 1);
            combo.deleteCharAt(combo.length() - 1);  
        }
    }







}