class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList(Arrays.asList(1)));
        if(numRows == 1){
            return result;
        }
        result.add(new ArrayList(Arrays.asList(1 , 1)));
        if(numRows == 2){
            return result;
        }
        for(int i=2;i<numRows;i++){
            int index = 1;
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            while(index != i ){
                temp.add(result.get(i-1).get(index) + result.get(i-1).get(index - 1));
                index++;
            }
            temp.add(1);
            result.add(temp);
        }

        return result;
    }
}