class Solution {
    public String convert(String s, int numRows) {

        // Edge cases
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder result = new StringBuilder();
        int cycle = 2 * (numRows - 1);

        // Traverse row by row
        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycle) {

                // vertical element
                result.append(s.charAt(j));

                // diagonal element (only for middle rows)
                int diag = j + cycle - 2 * row;

                if (row != 0 && row != numRows - 1 && diag < s.length()) {
                    result.append(s.charAt(diag));
                }
            }
        }

        return result.toString();
    }
}
