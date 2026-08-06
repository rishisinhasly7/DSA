class Solution {
    public int smallestNumber(int n, int t) {

        for(int i=n;i<100000;i++){
            int mul = 1;
            int temp = i;
            while(temp != 0){
            mul = mul * (temp%10);
            temp = temp / 10;
            }
            if(mul%t == 0){
                return i;
            }
        }
        return 0;
        
    }
}