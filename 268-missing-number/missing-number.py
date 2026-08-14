class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        maximum = len(nums)
        sum = 0
        num = 0
        for count in nums:
            sum += count
        for i in range(0,maximum+1):
            num += i
        return num - sum