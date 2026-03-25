class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int newBot = empty / numExchange;   
            drank += newBot;                   
            empty = empty % numExchange + newBot; 
        }
        return drank;
    }
}
