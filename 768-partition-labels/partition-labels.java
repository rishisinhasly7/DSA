class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans = new ArrayList<>();
        Map<Character , Integer> hash = new HashMap<>();

        for(int i=0;i<s.length();i++){
            hash.put(s.charAt(i) , i);
        }

        int end = 0;
        int size = 0;

        for(int i=0;i<s.length();i++){
            size++;

            end = Math.max(end , hash.get(s.charAt(i)));

            if(i == end){
                ans.add(size);
                size = 0;
            }
        }
    return ans;

    }
}