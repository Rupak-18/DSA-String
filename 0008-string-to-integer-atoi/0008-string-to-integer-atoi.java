class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, n = s.length();
        long digit = 0;
        
        // if string is empty
        if(s.length() == 0)
            return 0;

        // ignore leading whitespaces   
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }

        // determine the sign
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // finding the digit
        while(i < n && Character.isDigit(s.charAt(i))) {
            digit = digit * 10 + (s.charAt(i) - '0');

            // handle overflow
            if(sign * digit > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * digit < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)digit*sign;
    }
}
