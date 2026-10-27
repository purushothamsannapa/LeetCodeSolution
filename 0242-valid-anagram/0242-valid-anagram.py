class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        feq={}
        freq={}
        for char in s:
            feq[char]=feq.get(char,0)+1
        for char in t:
            freq[char]=freq.get(char,0)+1
        if freq == feq:
            return True
        else:
            return False
        