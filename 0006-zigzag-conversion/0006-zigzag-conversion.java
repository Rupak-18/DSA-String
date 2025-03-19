class Solution {
    public String convert(String s, int numRows) {
        
        String[] rows = new String[numRows];
        for (int row = 0; row < numRows; row++) {
            rows[row] = "";
        }

        int i = 0;  
        while (i < s.length()) {
            // Moving down the rows (top to bottom)
            for(int rowIndex = 0; rowIndex < numRows && i < s.length(); rowIndex++) {
                rows[rowIndex] += s.charAt(i++);
            }
            // Moving up the rows (bottom to top)
            for(int rowIndex = numRows-2; rowIndex > 0 && i < s.length(); rowIndex--) {
                rows[rowIndex] += s.charAt(i++);
            }
        }

        String answer = "";
        for (int row = 0; row < numRows; row++) {
            answer += rows[row];
        }
        return answer;
    }
}
