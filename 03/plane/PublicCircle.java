package plane;

public class PublicCircle{
    public double x;
    public double y;
    public double radius;

    public PublicCircle(){
        x = 0;
        y = 0;
        radius = 1;
    }



    public double getArea(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
}