public class Solution {
    char symbols[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    int values[] = {1000, 500, 100, 50, 10, 5, 1};
    
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0)
            return 0;
            
        s = s.toUpperCase();
        for(int i = 0; i < symbols.length; i++){
            int index = s.indexOf(symbols[i]);
            if(index != -1){
                return values[i] - romanToInt(s.substring(0, index)) + romanToInt(s.substring(index + 1));
            }
        }
        return 0;
    }
}