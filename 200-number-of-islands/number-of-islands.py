class Solution:
    def bfs(self,r,c,visit,rows,cols,grid):
        q = deque()
        visit.add((r , c))
        q.append((r , c))
        direction = [[1,0] , [0,1] , [-1,0] ,[0,-1]]
        while q:
            row , col = q.popleft()
            for x , y in direction:
                r , c = row+x,col+y

                if (r in range(rows) and c in range(cols) and grid[r][c] == '1' and (r,c) not in visit):
                    visit.add((r,c))
                    q.append((r,c))
    def numIslands(self, grid: List[List[str]]) -> int:
         count = 0 
         row = len(grid)
         column = len(grid[0])
         visit = set()

         for r in range(row):
             for c in range(column):
                 if grid[r][c] =='1' and (r,c) not in visit:
                    self.bfs(r , c ,visit,row,column,grid)
                    count += 1
         return count
                           