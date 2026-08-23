class Solution {
    public boolean isHappy(int n) {
        int slow = multiply(n);
        int fast = multiply(n);

        while(fast != 1){
            slow = multiply(slow);
            fast = multiply(multiply(fast));

            if(slow == fast && slow != 1){
                return false;
            }
        }
        return true;
    }

    public int multiply(int a){

        int temp = a;
        int sum = 0;
        while(temp != 0){
            int t = temp % 10;
            t *= t;
            sum = sum + t;
            temp /= 10;
        }
    return sum;
    }
}