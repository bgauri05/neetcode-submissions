class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0; int bot = ROWS - 1;
        while(top <= bot){
            int rows = (top + bot) / 2;
            if(target > matrix[rows][COLS - 1]) {
                top = rows + 1;
            } else if( target < matrix[rows][0]) {
                bot = rows - 1;
            } else {
                break;
            }
        }

        if(!(top <= bot)){
            return false;

        } 
        int rows = (top + bot)/2;
        int l = 0, r = COLS -1;
         while (l <= r) {
            int m = (l + r) / 2; // avoids integer overflow

            if (target > matrix[rows][m]) {
                  l = m+1;
            } else if (target < matrix[rows][m]) {
                r = m - 1;
            } else {
                return true;
            }
        }

        return false; // target not found
    }
           }

