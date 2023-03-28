package famous.sequence;

public class TriangularNumbers{
    public static int getTriangularNumber(int n){
        if(n == 1) return 1;
        return (n*(n+1))/2;
    }

    public static int getTriangularNumberAlternative(int n){
        if(n == 1) return 1;
        return (n*(n+1))/2;
    }
}
