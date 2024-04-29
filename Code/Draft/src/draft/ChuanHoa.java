
public class ChuanHoa {
    public static String chuanHoaTen(String s){
        String[] a = s.trim().split("\\s+");
        String name = "";
        for(String x : a){
            name += Character.toUpperCase(x.charAt(0));
            for(int i = 1; i < x.length(); i++)
                name += Character.toLowerCase(x.charAt(i));
            name += " ";
        }
        return name.trim();
    }
    
    public static String chuanHoaNgay(String s){
        StringBuilder sb = new StringBuilder(s);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }
}
