public class ComplexMain{

    public static void main(String[] args){

        Complex n1 = new Complex();
        n1.v = 4;
        n1.k = 3;
        System.out.println(n1.abs());
        n1.print();
        n1.add(3,4);
        n1.print();
        n1.sub(3,4);
        n1.print();
    }
}