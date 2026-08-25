class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> ans = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordList);
        ans.add(new ArrayList<>(List.of(beginWord)));

        if(wordSet.contains(endWord)){
            for(int j=0;j<ans.size();j++){

                List<String> temp = new ArrayList<>();

                if(wordSet.size() == 0){
                    break;
                }
            for(int i = 0;i<ans.get(j).size();i++){

                StringBuilder str = new StringBuilder(ans.get(j).get(i));
                
                StringBuilder t = new StringBuilder(str);
            for(int k=0;k<str.length();k++){
                
                for(char ch = 'a'; ch<='z';ch++){

                    str.setCharAt(k , ch);
                          if(wordSet.contains(str.toString())){
                        wordSet.remove(str.toString());
                        if(endWord.equals(str.toString())){
                         return ans.size()+1;
                        }
                        temp.add(str.toString());
                    }
                    str = new StringBuilder(t.toString());
                }
            }
        }
        if(temp.isEmpty()){
            return 0;
        }else{
            ans.add(temp);
        }
                
    }
}
        return 0;
    }     
}