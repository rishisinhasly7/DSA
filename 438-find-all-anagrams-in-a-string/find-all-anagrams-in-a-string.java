class Solution {
    public List<Integer> findAnagrams(String p, String s) {
       Map<Character , Integer> hash = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int start = 0 , matched = 0;
        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i) , hash.getOrDefault(s.charAt(i) , 0) + 1);
        }
        
        for(int i = 0;i < p.length(); i++){
            char ch = p.charAt(i);
            if(hash.containsKey(ch)){
                
                hash.put(ch , hash.getOrDefault(ch , 0) - 1);

                if(hash.get(ch) == 0) matched++;
            }

            if(matched == hash.size() ){
                ans.add(start); 
            }

            if(i >= s.length() - 1){
                char t = p.charAt(start);
                start++;
                if(hash.containsKey(t)){
                    if(hash.get(t) == 0) matched--;
                    hash.put(t , hash.getOrDefault(t , 0) + 1);
                }
                
            }
        }
        return ans;
    }
}