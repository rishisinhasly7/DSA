class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 1) return 1;
        int ans = Integer.MIN_VALUE;
        int start = 0;
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            hash.put(fruits[i] , hash.getOrDefault(fruits[i] , 0) + 1);

           while(hash.size() > 2){
                 hash.put(fruits[start] , hash.getOrDefault(fruits[start] , 0) - 1);
                 if(hash.get(fruits[start]) == 0){
                    hash.remove(fruits[start]);
                 }
                 start++;
            }
            if(hash.size() <= 2){
                ans = Math.max(ans , i - start + 1);
            }
        }
        return ans;
    }
}