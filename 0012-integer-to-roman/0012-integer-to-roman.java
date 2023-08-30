import java.util.Optional;

class Solution {
    public String intToRoman(int num) 
    {
        Map<Integer, String> map = new HashMap<>();

        //initialization of roman vals
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        ArrayList<Integer> arr = new ArrayList<>();
        int numMut =  num;
        int total = 0;
        String romanStr = "";
        while (total != num) 
        {
            int maxKey = 0;
            for (Integer key : map.keySet()) 
            {
                if (key <= numMut && key > maxKey) 
                {
                    maxKey = key;
                }
            }

            if (maxKey > 0) 
            {
                romanStr += map.get(maxKey);
                total += maxKey;
                numMut -= maxKey;
                continue;
            }
            break;
        }
        System.out.println(total);
        return romanStr;

        

        
    }
}