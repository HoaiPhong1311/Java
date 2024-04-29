
public class OTo extends Vehicle{
    private int maLuc;

    public OTo(String ma, String ten, String hang, String mau, int maLuc, int gia) {
        super(ma, ten, hang, mau, gia);
        this.maLuc = maLuc;
    }
    
    public String toString(){
        return ma + " " + ten + " " + hang
                + " " + mau + " " + maLuc + " " + gia;
    }
}
