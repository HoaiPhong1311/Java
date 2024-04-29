
public class Circle{
    private double r;
    private String c;
    private double pi = 3.14;

    public Circle(double r, String c) {
        this.r = r;
        this.c = c;
    }
    
    public double getArea(){
        return pi * r * r;
    }

    public String getC() {
        return c;
    }

    public double getR() {
        return r;
    }
    
    
}
