// Justin Butler
// 11/12/2021
class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        HashMap<Character, String> p = new HashMap<>(); // holds our pattern set.
        String[] words = s.split(" "); // de-couple our words
        if(words.length != pattern.length()){return false;}
        for(int i = 0; i < words.length; i++)
        {
            if(!p.containsValue(words[i]))
            {
                p.put(pattern.charAt(i), words[i]);
            }
        }
        for(int i = 0; i < pattern.length(); i++) // check our pattern set to see if it follows the same grouping as words.
        {
            if(!p.containsKey(pattern.charAt(i)))
            {
                return false;
            }
            if(!p.get(pattern.charAt(i)).equals(words[i]))
            {
                return false;
            }
        }
        return true;
        
    }
}
