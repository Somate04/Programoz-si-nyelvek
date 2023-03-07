public class Complex{
    private double v;
    private int k;

    public Complex(double v, int k){
        this.v = v;
        this.k = k;
    }

    public double getv(){
        return v;
    }

    public int getk(){
        return k;
    }

    public void setv(double v){
        this.v = v;
    }

    public void setk(double k){
        this.k = k;
    } 

    public double abs(){
        return Math.sqrt(Math.pow(v,2) + Math.pow(k,2));
    }

    public double add(Complex x){
        v += vx;
        k += ky;
    }

    public void sub(double vx, int ky){
        v -= vx;
        k -= ky;
    }

    public void mul(double vx, int ky){
        v = v * vx - k * ky; 
        k = 
    }
    
    public void print(){
        System.out.println("valós: " + v + ", "  +"képzetes: " + k);
    } 
}