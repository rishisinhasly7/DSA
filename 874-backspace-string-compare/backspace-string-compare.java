class Solution {
    public boolean backspaceCompare(String s, String t) {
    int s_last = s.length() - 1;
    int t_last = t.length() - 1;

    while(s_last >= 0 || t_last >=0 ){
        int i = find(s , s_last);
        int j = find(t , t_last);

        if(i < 0 && j < 0){
            return true;
        }

        if(i < 0 || j < 0){
            return false;
        }
        
        if(s.charAt(i) != t.charAt(j)) return false;

        s_last = i - 1;
        t_last = j - 1;
    }
        return true;
    
    }
    int find(String s , int index){
        int back = 0;
        while(index >= 0){
            if(s.charAt(index) == '#'){
                back++;
            }else if(back > 0){
                back--;
            }else{
                break;
            }
            index--;
        }
        return index;
    }
}