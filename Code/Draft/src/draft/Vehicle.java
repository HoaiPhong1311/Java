
public class Vehicle implements Comparable<Vehicle>{
    protected String ma, ten, hang, mau;
    protected int gia;

    public Vehicle(String ma, String ten, String hang, String mau, int gia) {
        this.ma = ma;
        this.ten = ten;
        this.hang = hang;
        this.mau = mau;
        this.gia = gia;
    }

    public String getHang() {
        return hang;
    }

    @Override
    public int compareTo(Vehicle t) {
        if(this.gia != t.gia) return t.gia - this.gia;
        return this.ma.compareTo(t.ma);
    }
}
