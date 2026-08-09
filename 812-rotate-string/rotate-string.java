class Solution {
    public boolean rotateString(String s, String goal) {

        char[] se = s.toCharArray();
        char[] goals = goal.toCharArray();

        for(int i=0;i<se.length;i++){
            char temp = se[se.length - 1];
            for(int j = se.length -1 ; j>=1 ; j--){
                se[j] = se[j-1];
            }
            se[0] = temp;
            if(Arrays.equals(se , goals)){
                return true;
            }
        }
        return false;
        
    }
}