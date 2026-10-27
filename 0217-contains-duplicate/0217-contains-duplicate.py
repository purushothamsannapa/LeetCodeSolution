class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        freq={}
        for num in nums:
            freq[num] = freq.get(num,0)+1
        for i in nums:
            if freq[i] >=2:
                return True
        return False
