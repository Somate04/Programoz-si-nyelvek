package linear.algebra;

public class GaussianElimination{
    
    private int rows;
    private int cols;
    private double[][] matrix;

    public GaussianElimination(int r, int c, double[][] m){
        this.rows = r;
        this.cols = c;
        this.matrix = m;
    }

    public int getRows(){
        return rows;
    }

    public int getCols(){
        return cols;
    }

    public double[][] getMatrix(){
        return matrix;
    }

    public void setMatrix(double[][] m){
        if(m.length != rows || m[0].length != cols){
            throw new IllegalArgumentException("Nem egyeznek a sorok vagy oszlopok száma!");
        }
        this.matrix = m;
    }

    private int argMax(int r, int c){
        int maxInd = r;
        double maxErt = Math.abs(matrix[r][c]);
        for(int i = r + 1; i < rows; i++){
            if(Math.abs(matrix[i][c]) > maxErt){
                maxInd = i;
                maxErt = Math.abs(matrix[i][c]);
            }
        }
        return maxInd;
    }

    public void backSubstitution(){
        for(int i = rows - 1; i >= 0; i--){
            if(matrix[i][i] == 0){
                throw new IllegalArgumentException();
            }
            for(int j = i - 1; j >= 0; j--){
                multiplyAndAddRow(j, i, i);
            }
        }
    }

    private void checkMatrixDimensions(double[][] m){}

    private void multiplyAndAddRow(int addRow, int mulRow, int colIndex){
        for(int i = colIndex; i < cols; i++){
            matrix[addRow][i] -= (matrix[addRow][colIndex]/matrix[mulRow][colIndex]) * matrix[mulRow][i];
        }
    }

    private void multiplyRow(int r, int c){
        for(int i = c; i < cols; i++){
            matrix[r][i] /= matrix[r][c];
        }
    }

    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols-1; j++){
                    if(matrix[i][j] >= 0){
                        System.out.print("+" + matrix[i][j]);
                    }
                    else{
                        System.out.print(matrix[i][j]);
                    }
                }
            System.out.print("=");
            if(matrix[i][cols - 1] >= 0){
                System.out.println("+" + matrix[i][cols-1]);
            }
            else{
                System.out.println(matrix[i][cols-1]);
            }
        }
    }

    public void rowEchelonForm(){
        int h = 0;
        int k = 0;

        while(h < rows && k < cols){
            int i_max = h;
            for(int i = h + 1; i < rows; i++){
                if(Math.abs(matrix[i][k]) > Math.abs(matrix[i_max][k])){
                    i_max = i;
                }
            }
            if(matrix[i_max][k] == 0){
                k++;
                h++;
            }
            else{
                swapRows(h, i_max);
                for(int i = h + 1; i < rows; i++){
                    double f = matrix[i][k] / matrix[h][k];
                    matrix[i][k] = 0;
                    for(int j = k + 1; j < cols; j++){
                        matrix[i][j] -= matrix[h][j] * f;
                    }
                }
                 
            }
            h++;
            k++;  
        }
    }

    private void swapRows(int r1, int r2){
        double[] t = matrix[r1];
        matrix[r1] = matrix[r2];
        matrix[r2] = t;
    }
}