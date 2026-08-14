class Solution:
    def spiralOrder(self, matrix):
        r = []
        while True:
           
            r.extend(matrix[0])
            matrix.pop(0)
            matrix = [item for item in matrix if len(item) > 0]
            if not matrix:
                return r

           
            for col in matrix:
                r.append(col[-1])
                col.pop(-1)
            matrix = [item for item in matrix if len(item) > 0]
            if not matrix:
                return r

            
            r.extend(matrix[-1][::-1])
            matrix.pop(-1)
            matrix = [item for item in matrix if len(item) > 0]
            if not matrix:
                return r

            
            for col in reversed(matrix):
                r.append(col[0])
                col.pop(0)
            matrix = [item for item in matrix if len(item) > 0]
            if not matrix:
                return r