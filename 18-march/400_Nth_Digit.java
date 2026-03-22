class Solution {
    public int findNthDigit(int n) {
        long digit=1;
        long start=1;
        long count=9;
        while(n > digit*count){
            n-=(digit*count);
            digit++;
            count=count*10;
            start=start*10;
        }
        long num=start+(n-1)/digit;
        String str=Long.toString(num);
        int ind=(n-1)%(int)digit;
        char ch=str.charAt(ind);
        return ch-'0';
    }
}
