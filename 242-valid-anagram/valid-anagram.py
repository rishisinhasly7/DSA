class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = "".join(sorted(s))
        t = "".join(sorted(t))
        if len(s) == len(t):
            for i in range(0 , len(s)):
                if(s[i] != t[i]):
                    return False
            return True
        else:
            return False

        