class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int real = n;

        while(n != 0){
            int temp = n%10;
            sum += temp;
           
                mul *= temp;
            
            
            n /= 10;
        }
        System.out.print("Sum-> " + sum +" Mul-> "+ mul);
        int divisor = sum + mul;
        if(real % divisor == 0){
            return true;
        }else{
            return false;
        }
    }
}