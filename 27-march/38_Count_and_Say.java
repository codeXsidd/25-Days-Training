class Solution {
    public String countAndSay(int n) {

        // Base case: first term is always "1"
        String res = "1";

        // Generate sequence from 2 to n
        for (int k = 2; k <= n; k++) {

            // To build current term
            StringBuilder sb = new StringBuilder();

            // Count of repeating characters
            int count = 1;

            // Traverse previous result string
            for (int i = 1; i < res.length(); i++) {

                // If same character → increase count
                if (res.charAt(i) == res.charAt(i - 1)) {
                    count++;
                } 
                else {
                    // If different → append count + previous character
                    sb.append(count);
                    sb.append(res.charAt(i - 1));

                    // Reset count
                    count = 1;
                }
            }

            // Append last group (important step)
            sb.append(count);
            sb.append(res.charAt(res.length() - 1));

            // Update result for next iteration
            res = sb.toString();
        }

        // Return nth term
        return res;
    }
}

// ----------------------------------Explanation-----------------------------------------------------------

/*
 i/p: n=4
  
    1 → "1"                  (given)         //initial
    2 → "11"                 (one 1)         // from the prev str, onetimes one
    3 → "21"                 (two 1s)        // from the prev str, twotimes one
    4 → "1211" ==> O/P       (one 2, one 1)  // from the prev str, onetimes two and onetime one 
	
*/

//-----------------------------------------------------------------------------------------------------------
