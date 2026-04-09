import java.math.BigInteger;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            long val=1;
            for(int k=0;k<=i;k++){
                row.add((int)val);
                val=val*(i-k)/(k+1);
            }
            ans.add(row);
        }
        return ans;
    }
}
