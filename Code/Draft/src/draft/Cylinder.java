
public class Cylinder implements Comparable<Cylinder>{
    private double height;
    private Circle day;

    public Cylinder(double height, Circle day) {
        this.height = height;
        this.day = day;
    }
    
    public double getVolume(){
        return day.getArea() * height;
    }

    @Override
    public int compareTo(Cylinder t) {
        if(this.getVolume() < t.getVolume()) return 1;
        else if(this.getVolume() > t.getVolume()) return -1;
        return this.day.getC().compareTo(t.day.getC());
    }

    @Override
    public String toString() {
        return String.format("Color : %s\n" 
                + "Height : %s\n" 
                + "Radius : %s\n" 
                + "Volume : %s\n" 
                + "-------------------", day.getC(), String.format("%.2f", height),
                String.format("%.2f", day.getR()), String.format("%.2f", getVolume()));
    }
    
    
}
