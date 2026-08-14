class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
        for key , value in enumerate(nums):
            if target-value in dic:
                return key , dic[target - value]
            else:
                dic[value] = key