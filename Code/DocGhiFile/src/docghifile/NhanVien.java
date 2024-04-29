
public class NhanVien {
    private String ten, ngaySinh, diaChi, mail;

    public NhanVien(String ten, String ngaySinh, String diaChi, String mail) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mail = mail;
    }
    
    public String chuanHoaTen(){
        String[] a = ten.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++)
                name += Character.toLowerCase(x.charAt(i));
            name += " ";
        }
        return name.trim();
    }
    
    public String chuanHoaNgay(){
        StringBuilder sb = new StringBuilder(ngaySinh);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", mail=" + mail + '}';
    }
}
