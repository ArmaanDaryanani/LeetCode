class Solution {
    ArrayList<String> output = new ArrayList<>();
    HashMap<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) 
    {
        if(digits.isEmpty())
        {
            return List.of();
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        combos("", digits);
        return output;
    }
    public void combos(String combo, String nextDigits)
    {
        if(nextDigits.isEmpty())
        {
            output.add(combo);
        }
        else
        {
            String str = map.get(nextDigits.charAt(0));
            for(char ch : str.toCharArray())
            {
                combos(combo + ch, nextDigits.substring(1));
            }
        }
    }
}