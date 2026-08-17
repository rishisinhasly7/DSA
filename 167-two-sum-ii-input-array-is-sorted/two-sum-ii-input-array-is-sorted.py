class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        m = {}
        ans = []
        for index , value in enumerate(numbers):
            if target - value in m:
                return [ m[target - value]+1 , index + 1]
            else:
                m[value] = index
            