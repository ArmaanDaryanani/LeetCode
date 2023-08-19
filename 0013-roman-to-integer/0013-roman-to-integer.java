
public class Solution
{
    public int romanToInt(String input)
    {
        int total = 0;

        for (int i = 0; i < input.length(); i++)
        {   
         while (true)
         {
            try{
            if (input.toLowerCase().charAt(i) == 'i')
            {   
                if (input.toLowerCase().charAt(i+1) == 'v')
                {
                    total = total + 4; 
                    i++;
                    break;
                }
                if (input.toLowerCase().charAt(i+1) == 'x')
                {
                    total = total + 9;
                    i++;
                    break;
                }
              } 
            }catch (StringIndexOutOfBoundsException e){
               total = total + 1;
               break;
               } 
            

            if (input.toLowerCase().charAt(i) == 'x')
            {
              try{
                if (input.toLowerCase().charAt(i+1) == 'l')
                {
                    total = total + 40; 
                    i++;
                    break;
                }
                if (input.toLowerCase().charAt(i+1) == 'c')
                {
                    total = total + 90;
                    i++;
                    break;
                }
              }catch (StringIndexOutOfBoundsException e){
               total = total + 10;
               break;
               }
            }

            if (input.toLowerCase().charAt(i) == 'c')
            { 
              try{
                if (input.toLowerCase().charAt(i+1) == 'd')
                {
                    total = total + 400; 
                    i++;
                    break;
                }
                if (input.toLowerCase().charAt(i+1) == 'm')
                {
                    total = total + 900;
                    i++;
                    break;
                }
              } catch (StringIndexOutOfBoundsException e){
               total = total + 100;
               break;
               }
                
            }
          
            

          if (input.toLowerCase().charAt(i) == 'i')
          {
                total = total + 1;
                break;
          }

          if (input.toLowerCase().charAt(i) == 'v')
          {
                total = total + 5;
                break;
          }

          if (input.toLowerCase().charAt(i) == 'x')
          {
                total = total + 10;
                break;
          }

          if (input.toLowerCase().charAt(i) == 'l')
          {
                total = total + 50;
                break;
          }

          if (input.toLowerCase().charAt(i) == 'c')
          {
                total = total + 100;
                break;
          }

          if (input.toLowerCase().charAt(i) == 'd')
          {
                total = total + 500;
                break;
          }
                
          if (input.toLowerCase().charAt(i) == 'm')
          {
                total = total + 1000;
                break;
          }

          break;
             
         }
        }
        return total;

    }
}

