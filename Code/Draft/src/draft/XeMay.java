
public class XeMay extends Vehicle {
    private int tocDo;

    public XeMay(String ma, String ten, String hang, String mau, int tocDo, int gia) {
        super(ma, ten, hang, mau, gia);
        this.tocDo = tocDo;
    }
    
    public String toString(){
        return ma + " " + ten + " " + hang + " "
                + mau + " " + tocDo + " " + gia;
    }
}
