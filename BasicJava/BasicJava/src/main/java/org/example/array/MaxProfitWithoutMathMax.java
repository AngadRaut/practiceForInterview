package org.example.array;

public class MaxProfitWithoutMathMax {
    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};

        int lowestSoFar = stockPrices[0];  // Initial minimum price
        int maxGain = 0;  // Maximum profit

        for (int i = 1; i < stockPrices.length; i++) {
            int todayPrice = stockPrices[i];

            if (todayPrice < lowestSoFar) {
                lowestSoFar = todayPrice;  // Found new lower price
            } else if (todayPrice - lowestSoFar > maxGain) {
                maxGain = todayPrice - lowestSoFar;  // Found better profit
            }
        }
        System.out.println("Maximum Profit: " + maxGain);
    }
}