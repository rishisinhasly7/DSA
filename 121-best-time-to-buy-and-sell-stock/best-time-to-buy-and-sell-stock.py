class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lsf = 1000000
        ans = 0
        max = -1
        for nums in prices:
            if nums < lsf :
                lsf = nums
            ans = nums - lsf
            if(ans > max):
                max = ans
        return max
        