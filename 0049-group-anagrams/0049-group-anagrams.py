class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        strtable={}

        for string in strs:
            sorted_string = ''.join(sorted(string))

            if sorted_string not in strtable:
                strtable[sorted_string]=[]
            
            strtable[sorted_string].append(string)

        return list(strtable.values())
        