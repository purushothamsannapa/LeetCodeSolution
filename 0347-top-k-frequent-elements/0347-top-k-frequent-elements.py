class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        freq={}
        for num in nums:
            freq[num]=freq.get(num,0)+1
        k_freq=sorted(freq.keys(),key= lambda x: freq[x],reverse=True)
        return k_freq[:k]