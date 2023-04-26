import java.util.ArrayList;

public class Result {
    
    public static int findModeCount(int num, int base, String start) {
        final String VALUE = "0123456789ABCDEF";
        
        ArrayList<String> output = new ArrayList<String>();
        ArrayList<Integer> existence = new ArrayList<Integer>();
        
        int startNum10 = 0;
        int startLength = start.length();
        int resultNum10;
        int count = 0;
        String remainder = "";
        int existenceCount = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < start.length(); i++)
        {
            
            startNum10 += VALUE.indexOf(start.substring(i, i + 1)) * Math.pow(base, startLength - 1);
            startLength--;
            
        }

        while(count < num)
        {
            remainder = "";
            resultNum10 =  startNum10 + count;

            while(resultNum10 > 0)
            {
                
                remainder = VALUE.substring(resultNum10 % base, resultNum10 % base + 1) + remainder;
                resultNum10 /= base;
                
            }

            output.add(remainder);
            count++;
            
        }

        for(int i = 0; i < VALUE.length(); i++)
        {
            
            existenceCount = 0;
            existence.add(0);
            
            for(int j = 0; j < output.size(); j++)
            {
                
                for(int k = 0; k < output.get(j).length(); k++)
                {
                    
                    if(output.get(j).substring(k, k + 1).equals(VALUE.substring(i, i + 1)))
                    {
                        
                        existenceCount++;
                        
                    }
                    
                }
                
            }
            
            existence.set(i, existenceCount);
            
        }
        
        for(int i = 0; i < existence.size(); i++)
        {
            
            max = Math.max(max, existence.get(i));
            
        }

        return max;
        
    }

}