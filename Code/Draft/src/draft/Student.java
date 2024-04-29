
public class Student extends Person{
    private String lop, ma;
    private double gpa;

    public Student(String ma, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
        super(ten, ngaySinh, diaChi);
        this.lop = lop;
        this.ma = ma;
        this.gpa = gpa;
    }

    public String toString(){
        return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}
