class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remainder = sum % k;
            if (remainder < 0) {
                remainder += k;
            }
            if (remainder == 0) {
                count++;
            }
            if (hm.containsKey(remainder)) {
                count += hm.get(remainder);
            }
            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}
