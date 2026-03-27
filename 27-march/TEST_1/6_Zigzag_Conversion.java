class Solution {
    public String convert(String s, int numRows) {

        // If only one row → no zigzag pattern → return original string
        if (numRows == 1) return s;

        // StringBuilder to store final result
        StringBuilder result = new StringBuilder();

        // One complete zigzag cycle length
        // Example: numRows = 4 → cycle = 2 * (4 - 1) = 6
        int cycle = 2 * (numRows - 1);

        // Traverse each row one by one
        for (int row = 0; row < numRows; row++) {

            // Start index for current row
            int i = row;

            // Used only for middle rows to alternate steps
            boolean toggle = true;

            // Traverse characters in this row
            while (i < s.length()) {

                // Add current character to result
                result.append(s.charAt(i));

                // Case 1: First row or last row
                // Always jump by full cycle
                if (row == 0 || row == numRows - 1) {
                    i += cycle;
                } 
                else {
                    // Case 2: Middle rows → alternate jumps

                    // Step when moving diagonally down
                    int step1 = cycle - 2 * row;

                    // Step when moving diagonally up
                    int step2 = 2 * row;

                    // Alternate between step1 and step2
                    if (toggle) {
                        i += step1;
                    } else {
                        i += step2;
                    }

                    // Flip toggle for next step
                    toggle = !toggle;
                }
            }
        }

        // Return final zigzag string
        return result.toString();
    }
}

//-------------------------------------------------------Explantion--------------------------------------

/*
s = "PAYPALISHIRING", numRows = 4

+---+---+---+---+---+---+---+
| P |   |   | I |   |   | N |
+---+---+---+---+---+---+---+
| A |   | L | S |   | I | G |
+---+---+---+---+---+---+---+
| Y | A |   | H | R |   |   | 
+---+---+---+---+---+---+---+
| P |   |   | I |   |   |   |    
+---+---+---+---+---+---+---+


O/p----- > PINALSIGYAHRPI



*/
