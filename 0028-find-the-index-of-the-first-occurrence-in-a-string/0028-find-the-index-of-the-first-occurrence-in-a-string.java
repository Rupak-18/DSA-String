class Solution {
    public int strStr(String haystack, String needle) {
        // int j = 0;
        // int pos = -1;
        // int i = 0;
        // for(i = 0; i < haystack.length(); i++) {
        //     if(haystack.charAt(i) == needle.charAt(j)) 
        //         j++;
        //     else
        //         j = 0;
        //     if(j == needle.length())
        //         break;
        // }
        // if(i != haystack.length())
        //     pos = i - j + 1;
        // return pos;

        if(!haystack.contains(needle))
            return -1;

        int m = haystack.length();
        int n = needle.length();
        int pos = 0;

        for(int i = 0; i < m-n+1; i++) {
            if(haystack.substring(i, i+n).equals(needle)) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}