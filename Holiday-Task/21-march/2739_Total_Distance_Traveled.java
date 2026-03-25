class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int possible = (mainTank - 1) / 4;
        int extra;

        if (possible < additionalTank) {
            extra = possible;
        } else {
            extra = additionalTank;
        }

        return (mainTank + extra) * 10;
    }
}
