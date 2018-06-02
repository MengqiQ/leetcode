public class Matrix542 {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int[][] result = new int[matrix.length][matrix[0].length];
        int range = matrix.length * matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    result[i][j] = 0;
                }else {
                    int upper = (i > 0) ? result[i-1][j] : range;
                    int left = (j > 0) ? result[i][j-1] : range;
                    result[i][j] = Math.min(upper, left) + 1;
                }

            }

        }
        for (int i = matrix.length - 1; i >= 0 ; i--) {
            for (int j = matrix[0].length - 1; j >= 0 ; j--) {
                if(matrix[i][j] == 0) {
                    result[i][j] = 0;
                }else {
                    int down = (i < matrix.length - 1) ? result[i+1][j] : range;
                    int right = (j < matrix[0].length - 1) ? result[i][j+1] : range;
                    result[i][j] = Math.min(Math.min(down, right) + 1, result[i][j]);
                }

            }
        }
        return result;
    }



}
