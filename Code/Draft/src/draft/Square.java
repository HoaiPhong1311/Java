
public class Square extends Rectangle {

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    public String toString(){
        return "-----------------------\n" + "Side : " + String.format("%.2f\n", width) 
                + "Color : " + this.color + "\nFilled : " + this.filled + "\n"
                + "Perimeter : " + String.format("%.2f\n", this.getPerimeter())
                + "Area : " + String.format("%.2f\n", this.getArea())
                + "-----------------------\n";
    }
}
