class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] A = new int[256];
        // int[] B = new int[256];
        // Arrays.fill(A, -1);
        // Arrays.fill(B, -1);
        // for(int i = 0; i<s.length(); i++) {
        //     char st = s.charAt(i);
        //     char tt = t.charAt(i);

        //     if(A[st] == -1 && B[tt] == -1) {
        //         A[st] = tt;
        //         B[tt] = st;
        //     }
        //     else if(A[st] != tt || B[tt] != st) {
        //         return false;
        //     }
        // }
        // return true;

        int len = s.length();
        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < len; i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (charMap.containsKey(a)) {
                if (charMap.get(a) != b) {
                    return false;
                }
            } else if (charMap.containsValue(b)) {
                return false;
            }

            charMap.put(a, b);
        }
        return true;
        
        
        
        
        
        
        
        
        
        
        
        
        
        // if(s.length() != t.length()) 
        //     return false;
        // Map<Character, Character> hashing = new HashMap<>();
        // for(int i = 0; i<s.length(); i++) {
        //     if(!hashing.containsKey(s.charAt(i)))
        //             hashing.put(s.charAt(i), t.charAt(i));
        //     else {
        //         if(t.charAt(i) == hashing.get(s.charAt(i)))
        //             continue;
        //         else
        //             return false;
        //     }
        // }
        // return true;
    }
}