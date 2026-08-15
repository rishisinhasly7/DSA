class Solution {
    public int numIslands(char[][] grid) {
        Set<List<Integer>> visit = new HashSet<>();
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){ 
                List<Integer> pair = Arrays.asList(i, j);
                if(grid[i][j] == '1' && !visit.contains(pair)){
                        bfs(i , j, row, col , visit , grid);
                        count += 1;
                }
            }
        }

    return count;
    }
    public void bfs(int r , int c , int row , int col , Set<List<Integer>> visit,char[][] grid){
         Deque<List<Integer>> deque = new ArrayDeque<>();
         List<Integer> pair = Arrays.asList(r, c);
         visit.add(pair);
         deque.add(pair);
        int[][] direction = {{1,0},{0,1},{-1,0},{0,-1}};
         while(!deque.isEmpty()){
            List<Integer> savedPair = deque.pollFirst(); 
            for(int i=0;i<direction.length;i++){
                r = savedPair.get(0) + direction[i][0];
                c =  savedPair.get(1) + direction[i][1];
                List<Integer> pairs = Arrays.asList(r, c);
                if(r >= 0 && r < row && c >= 0 && c < col && grid[r][c] == '1' && !visit.contains(pairs)){
                    deque.add(pairs);
                    visit.add(pairs);
                }


            }
         }

    }
}