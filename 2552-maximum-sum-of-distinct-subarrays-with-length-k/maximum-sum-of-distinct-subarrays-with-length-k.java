import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        if (k > n) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        long windowSum = 0;
        long maxSum = 0;

        for (int i = 0; i < n; i++) {

            // Add current element
            windowSum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Remove element if window size exceeds k
            if (i >= k) {
                windowSum -= nums[i - k];

                map.put(nums[i - k], map.get(nums[i - k]) - 1);

                if (map.get(nums[i - k]) == 0) {
                    map.remove(nums[i - k]);
                }
            }

            // Check if current window has size k and all elements are distinct
            if (i >= k - 1 && map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}