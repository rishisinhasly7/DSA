class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList(Arrays.asList(1)));
        if(rowIndex == 0){
            return result.get(rowIndex);
        }
        result.add(new ArrayList(Arrays.asList(1 , 1)));
        if(rowIndex == 1){
            return result.get(rowIndex);
        }
        for(int i=2;i<rowIndex+1;i++){
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

        return result.get(rowIndex);
    }
}

