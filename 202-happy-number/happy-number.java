class Solution {
    public static boolean isHappy(int n) {
    Map<Integer,Integer> hash = new HashMap<>();

    while(n != 1){
            hash.put(n , 1);
            int sum = find(n);
            System.out.println(sum);
            n = sum;
            if(hash.containsKey(sum)){
                return false;
            }
        }
        return true;
    }

   static int find(int k){
        int sum = 0;
        while(k != 0){
            int temp = k%10;
            temp = temp*temp;
            sum += temp;
            k /= 10;
        }
        return sum;
    }
}