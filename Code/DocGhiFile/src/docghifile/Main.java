
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("input.txt");
       PrintWriter out = new PrintWriter("output.txt");
//       out.write("Hehe");
//       out.close();
        try {
            Scanner sc = new Scanner(file);
            String s;
            ArrayList<NhanVien> arr = new ArrayList<>();
            while(sc.hasNext()){
                s = sc.nextLine();
                String[] a = s.split(",");
                NhanVien nv = new NhanVien(a[0], a[1], a[2], a[3]);
                nv.chuanHoaNgay();
                nv.chuanHoaTen();
                System.out.println(nv);
                arr.add(nv);
            }

            Collections.sort(arr, new Comparator<NhanVien>(){
                @Override
                public int compare(NhanVien x, NhanVien y) {
                    return x.getTen().compareTo(y.getTen());
                }
            });
            for(NhanVien x : arr){
                out.write(x.toString());
                out.write("\n");
            }
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
