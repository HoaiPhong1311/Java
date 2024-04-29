
public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
 
    public double getArea(){
        return width * length;
    }
    
    public double getPerimeter(){
        return 2 * (width + length);
    }
    
    public String toString(){
        return "-----------------------\n" + "Width : " + String.format("%.2f\n", this.width) 
                + "Length : " + String.format("%.2f\n", this.length) + super.toString()
                + "Perimeter : " + String.format("%.2f\n", this.getPerimeter())
                + "Area : " + String.format("%.2f\n", this.getArea())
                + "-----------------------\n";
    }
}
