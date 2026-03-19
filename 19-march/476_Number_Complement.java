class Solution {
    public int findComplement(int num) {
        int complement = 0;
        int powerOfTwo = 1;

        while (num > 0) {
            if ((num & 1) == 0) {
                complement += powerOfTwo;
            }
            num >>= 1;
            powerOfTwo <<= 1;
        }

        return complement;
    }
}
