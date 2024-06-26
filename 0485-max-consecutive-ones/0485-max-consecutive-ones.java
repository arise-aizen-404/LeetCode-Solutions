class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int x: nums) {
            if (x == 0) count = 0;
            else count++;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}