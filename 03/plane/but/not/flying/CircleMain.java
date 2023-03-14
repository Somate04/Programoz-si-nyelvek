package plane.but.not.flying;

import plane.PublicCircle;
import plane.Circle;

public class CircleMain{
    public static void main(String[] args){
        PublicCircle c = new PublicCircle();
        System.out.println(c.getArea());
        c.x=5;
        c.y=2;
        c.radius=10;
        System.out.println(c.getArea());
        Circle c2 = new Circle();
        c2.setX(5);
        c2.setY(2);
        c2.setRadius(10);
        System.out.println(c2.getX());
        System.out.println(c2.getY());
        System.out.println(c2.getRadius());
        Circle c3 = new Circle(1,1,1);
        System.out.println(c3.getY());
    }
}