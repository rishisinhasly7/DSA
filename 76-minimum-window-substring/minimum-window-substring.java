class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        String result = "";
        Map<Character , Integer> hash = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        int start = 0 , matched = 0;
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            hash.put(ch, hash.getOrDefault(ch , 0) + 1);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, hash.getOrDefault(ch , 0) - 1);
                if(hash.get(ch) == 0) matched++;
            }

            while(matched == hash.size()){
               int k = Math.min(ans , i - start + 1);
               if(k < ans){
                ans = k;
                result = s.substring(start , i+1);
               }
               if(hash.containsKey(s.charAt(start))){
                if(hash.get(s.charAt(start)) == 0) matched--;
                hash.put(s.charAt(start) , hash.getOrDefault(s.charAt(start) , 0) + 1);
               } 
               start++; 
            }
        }
        return result;
    }
}