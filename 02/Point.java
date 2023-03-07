public class Point{
    private double x;
    private double y;
    //private, protected, public -- láthatóság

    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public void setx(double x){
        if(x >= 0){
            this.x = x;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public void sety(double x){
        this.y = y;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public void move(double dx, double dy){
        x += dx;
        y += dy;
    }

    public void mirror(double cx, double cy){
        double dx = (cx - x) * 2;
        double dy = (cy - y) *2;
        
        move(dx, dy);
    }

    public void print(){
        System.out.println("(" + x + "," + y + ")");
    }

    public void mirror(Point other){
        double dx = (other.x - x) * 2; //túlterhelés
        double dy = (other.y - y) * 2;

        move(dx, dy);
    }

    public double distance(Point p){
        double dx = (x - p.x);
        double dy = (y -p.y);
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}