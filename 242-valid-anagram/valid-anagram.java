class Solution {
    public boolean isAnagram(String s, String t) {
        char [] s_str = s.toCharArray();
        char [] t_str = t.toCharArray();
        Arrays.sort(s_str);
        Arrays.sort(t_str);
        if(s_str.length == t_str.length){
            for(int i=0;i<s_str.length;i++){
            if(s_str[i] != t_str[i]){
                return false;
            }
        } 
    return true; 
    }else{
return false; 
    }
            
        
    }
}