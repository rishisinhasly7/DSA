class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hash = new HashMap<>();
        int start = 0;
        int matched = 0;
        for(int i=0;i<s1.length();i++){
            hash.put(s1.charAt(i) , hash.getOrDefault(s1.charAt(i) , 0)  + 1);
        }
        for(int i=0;i<s2.length();i++){
            if(hash.containsKey(s2.charAt(i))){
                hash.put(s2.charAt(i) , hash.getOrDefault(s2.charAt(i) , 0)  - 1);
            }

            if(hash.containsKey(s2.charAt(i)) && hash.get(s2.charAt(i)) == 0){
                matched++;
            }
            if(matched == hash.size()){
                return true;
            }

            if(i - start + 1 == s1.length()){
                if(hash.containsKey(s2.charAt(start))){
                    
                     if(hash.get(s2.charAt(start)) == 0) matched--;
                      hash.put(s2.charAt(start) , hash.getOrDefault(s2.charAt(start) , 0)  + 1);
                }
                
                start++;
            }
        }
        return false;
    }
}