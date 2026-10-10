class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int m=target-nums[i];
            if(map.containsKey(m))
            {
                return new int[]{map.get(m),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}