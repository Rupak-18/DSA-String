class Solution {
    public boolean rotateString(String s, String goal) {
       
        String str = s + s;
        if(s.length() != goal.length())
            return false;

        if(str.contains(goal)) 
            return true;
        else
            return false;
    }
}