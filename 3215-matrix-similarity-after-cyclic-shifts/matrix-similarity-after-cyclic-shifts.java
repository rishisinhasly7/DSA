class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int row = mat.length;
        int column = mat[0].length;
        int[][] mat1 = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                mat1[i][j] = mat[i][j];
            }
        }

        for(int i=0;i<mat.length;i++){
            if(i % 2 == 0){
                evenShift(mat[i] , k);
            }else{
                oddShift(mat[i] , k);
            }
        }

        if(Arrays.deepEquals(mat1 , mat)){
            return true;
        }
        return false;
        
    }

    public void evenShift(int[] a , int k){
        int t = 0;
       
        while(t != k){
             int temp = a[0];
                for(int i = 1;i<a.length;i++){
                    a[i-1] = a[i];
             }
             a[a.length - 1] = temp;
             t++;
        }
    }

    public void oddShift(int[] a , int k){
        int t = 0;
        
        while(t != k){
            int temp = a[a.length - 1];
                for(int i = a.length - 1; i>=1 ;i--){
                    a[i]= a[i-1];
             }
             a[0] = temp;
             t++;
        }
    }
}