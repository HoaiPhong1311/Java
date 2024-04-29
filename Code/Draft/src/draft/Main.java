import java.util.Arrays;
  import java.util.Comparator;
  import java.util.Scanner;
  
  
  class Person {
      private String ten, ngaySinh, diaChi;
  
      public Person(String ten, String ngaySinh, String diaChi) {
          this.ten = ten;
          this.ngaySinh = ngaySinh;
          this.diaChi = diaChi;
      }
  
      public Person() {
          ten = "";
          ngaySinh = "";
          diaChi = "";
      }
      
      public void chuanHoa(){
          // chuanHoaTen
          String[] a = ten.trim().split("\\s+");
          String name = "";
          for(String x : a){
              name += Character.toUpperCase(x.charAt(0));
              for(int i = 1; i < x.length(); i++)
                  name += Character.toLowerCase(x.charAt(i));
              name += " ";
          }
          ten = name.trim();
          
          // chuanHoaNgaySinh
          StringBuilder sb = new StringBuilder(ngaySinh);
          if(sb.charAt(1) == '/') sb.insert(0, 0);
          if(sb.charAt(4) == '/') sb.insert(3, 0);
          ngaySinh = sb.toString();
      }
  
      public String getSortedName(){
          String[] a = ten.trim().split("\\s+");
          String name = a[a.length - 1] + " ";
          for(int i = 0; i < a.length - 1; i++){
              name += a[i] + " ";
          }
          return name.trim();
      }
      
      public String toString(){
          return ten + " " + ngaySinh + " " + diaChi;
      }
  }
  
  
  class Student extends Person {
      private String ma, lop;
      private double gpa;
  
      public Student(String ma, String lop, double gpa, String ten, String ngaySinh, String diaChi) {
          super(ten, ngaySinh, diaChi);
          this.ma = ma;
          this.lop = lop;
          this.gpa = gpa;
      }
      
      public String toString(){
          return ma + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
      }
  }
  
  public class Main {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          int n = sc.nextInt();
          Student[] a = new Student[n];
          for(int i = 0; i < n; i++){
              String ma = String.format("%04d", i + 1);
              sc.nextLine();
              String ten, ngaySinh, diaChi, lop;
              double gpa;
              ten = sc.nextLine();
              ngaySinh = sc.nextLine();
              diaChi = sc.nextLine();
              lop = sc.nextLine();
              gpa = sc.nextDouble();
              a[i] = new Student(ma, lop, gpa, ten, ngaySinh, diaChi);
              a[i].chuanHoa();
              a[i].getSortedName();
          }
          
          Arrays.sort(a, new Comparator<Student>(){
              @Override
              public int compare(Student x, Student y) {
                  return x.getSortedName().compareTo(y.getSortedName());
              }
          });
          
          for(Student x : a){
              System.out.println(x);
          }
      }
  }