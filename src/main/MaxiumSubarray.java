package main;

public class MaxiumSubarray {

    public int maxSubArray(int[] inputs) {
        int maxEndingHere = inputs[0], maxSoFar = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + inputs[i], inputs[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
