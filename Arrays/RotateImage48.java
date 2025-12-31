class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose of a matrix 
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                swap(matrix, i, j);
            }
        }

        // Reverse every row of a matrix 
        for (int i = 0; i < n ; i++){
            reverseRow(matrix[i], n);
        }
    }

        //Reverse function
    static void reverseRow(int[] row, int n){
        int p1 = 0, p2 = n-1;
        while(p1<p2){
            int temp = row[p1];
            row[p1] = row[p2];
            row[p2] = temp;
            p1++; p2--;
        }
    }

    //swap function
    static void swap(int matrix[][], int i , int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;

    }
}
   
