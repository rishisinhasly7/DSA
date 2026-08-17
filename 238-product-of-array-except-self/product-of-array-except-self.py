class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefixMul = []
        pmul = 1
        suffixMul = []
        smul = 1
        ans = []

        for num in nums:
            pmul = pmul *num
            prefixMul.append(pmul)
        for num in reversed(nums):
            smul = smul * num
            suffixMul.append(smul)
        suffixMul.reverse()
        ans.append(suffixMul[1])
        for i in range(1,len(nums)-1):
            ans.append(prefixMul[i-1] * suffixMul[i+1])
        ans.append(prefixMul[len(nums) - 2])
        return ans
        




        