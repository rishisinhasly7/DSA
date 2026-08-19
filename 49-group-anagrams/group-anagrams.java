class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] arr = new int[strs.length];

        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            List<String> temp = new ArrayList<>();
            if(arr[i] != -1){
                temp.add(strs[i]);
                arr[i] = -1;
            } 
            for(int j =i+1;j<strs.length;j++){
                
                if(checkAnagram(strs[i] , strs[j]) && arr[j] == 0){
                    temp.add(strs[j]);
                    arr[j] = -1;
                }
            }
            if(!temp.isEmpty()){
                ans.add(temp);
            }
        }
        return ans;
    }
    public boolean checkAnagram(String str1 , String str2){
        int[] hash = new int[26];

        if(str1.length() == str2.length()){
            for(int i=0;i<str1.length();i++){
                hash[str1.charAt(i) - 'a']++;

                hash[str2.charAt(i) - 'a']--;
            }
            for(int j=0;j<26;j++){
                if(hash[j] != 0){
                    return false;
                }
            }
            return true;

        }else{
            return false;
        }
    }
}