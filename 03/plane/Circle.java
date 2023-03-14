package plane;

public class Circle{

    private double x;
    private double y;
    private double radius;

    public Circle(){
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;

        if(radius <= 0){
                throw new IllegalArgumentException();
        }
        else{
            this.radius = radius;
        }
        
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRadius(double radius){
        if(radius <= 0){
            throw new IllegalArgumentException();
        }
        else{
            this.radius = radius;
        }
    }

   

    
}