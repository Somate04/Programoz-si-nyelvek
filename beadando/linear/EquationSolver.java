package linear;

public class EquationSolver{
    public static double[][] stringsToDoubles(String[] strings){
        double[][] doubles = new double[strings.length][];
        for(int i = 0; i < strings.length; i++){
            String[] numbers = strings[i].split(",");
            doubles[i] = new double[numbers.length];
            for(int j = 0; j < numbers.length; j++){
                doubles[i][j] = Double.parseDouble(numbers[j]);
            }
        }
        return doubles;
    }

    public static void main(String[] args){
        double[][] matrix = stringsToDoubles(args);
        int rows = matrix.length;
        int columns = matrix[0].length;
        linear.algebra.GaussianElimination gauss = new linear.algebra.GaussianElimination(rows, columns, matrix);
        gauss.print();
        gauss.rowEchelonForm();
        gauss.print();
        gauss.backSubstitution();
        gauss.print();
    }


}