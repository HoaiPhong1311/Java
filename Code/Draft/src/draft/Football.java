
public class Football {
    private String ma, ten;
    private int tran, hieuSo, diem;

    public Football(String ma, String ten, int tran, int hieuSo, int diem) {
        this.ma = ma;
        this.ten = ten;
        this.tran = tran;
        this.hieuSo = hieuSo;
        this.diem = diem;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTran(int tran) {
        this.tran = tran;
    }

    public void setHieuSo(int hieuSo) {
        this.hieuSo = hieuSo;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTran() {
        return tran;
    }

    public int getHieuSo() {
        return hieuSo;
    }

    public int getDiem() {
        return diem;
    }
    
    public void display(int i){
        System.out.println("#" + i + " " + ma + " " + ten + " " + 
                tran + " " + hieuSo + " " + diem);
        System.out.println("------------------");
    }
}
