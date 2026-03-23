class Solution {
    public int lastRemaining(int n) {
        int start=1;
        int step=1;
        boolean left=true;
        while(n!=1){
            if(left || (n%2!=0)){
                start=start+step;
            }
            n=n/2;
            step=step*2;
            left=!left;
        }
        return start;
    }
}
