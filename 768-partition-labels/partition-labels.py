class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        dic = {}
        ans = []
        for i,v in enumerate(s):
            dic[v] = i
        
        end = 0
        size = 0
        for i,v in enumerate(s):
            size += 1
            end = max(end , dic[v])
            if(end == i):
                ans.append(size)
                size = 0
        return ans