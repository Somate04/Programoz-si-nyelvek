class PointMain{

    public static void main(String[] args){

        Point p1 = new Point(2, 4);

        p1.move(1,0);
        p1.print();
        p1.mirror(0,0);
        p1.print();
        Point origo = new Point(0,0);
        p1.mirror(origo);
        p1.print();
        System.out.println(p1.distance(origo));
        System.out.println(p1.getx());
    }
}