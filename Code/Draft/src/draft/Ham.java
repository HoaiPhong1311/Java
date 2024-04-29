
public class Ham {
    
    public static boolean soNguyenTo(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }
    
    public static int uocSoNguyenToNhoNhat(int n){
        if(n <= 1) return 1;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return i;
            }
        }
        return n;
    }
    
    public static void thuaSoNguyenTo(long n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int mu = 0;
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                System.out.printf("%d^%d", i, mu);
                if(n != 1) System.out.print(" * ");
            }
        }
        if(n > 1) System.out.printf("%d^1", n);
    }
    
    public static long demThuaSoNguyenTo(long n){
        int count = 0;
        long i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                count++;
            }
            i++;
        }
        if (n > 1) {
            count++;
        }
        return count;
    }   
    
    public static int tongChuSo(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static boolean binhPhuongNT_1(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int mu = 0;
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                if(mu >= 2) return true;
            }
        }
        return false;
    }
    
    public static boolean binhPhuongNT_2(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                int mu = 0;
                while(n % i == 0){
                    mu++;
                    n /= i;
                }
                if(mu == 1) return false;
            }
        }
        if(n > 1) return false;
        return true;
    }
    
    public static boolean chinhPhuong(long n){
        long tmp = (long)Math.sqrt(n);
        if(tmp * tmp == n) return true;
        else return false;
    }
    
    public static void chinhPhuongDoan(long a, long b){
        for(long i = (long)Math.ceil(Math.sqrt(a)); i <= (long)Math.sqrt(b); i++)
            System.out.println(i * i + " ");
    }
    
    public static boolean soLonNhat(int n){
        int tmp = n % 10;
        while(n != 0){
            if(n % 10 > tmp) return false;
            n /= 10;
        }
        return true;
    }
    
    public static boolean fibo(long n){
        if(n == 0 || n == 1) return true;
        long[] F = new long[100];
        F[0] = 0;
        F[1] = 1;
        for(int i = 2; i <= 92; i++){
            F[i] = F[i - 1] + F[i - 2];
            if(n == F[i]) return true;
        }
        return false;
    }
    
    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
    
    public static long toHop(int n, int k){
        k = Math.max(k, n - k);
        long res = 1;
        for(int i = 1; i <= k; i++){
            res *= (n - i + 1);
            res /= i;
        }
        return res;
    }

    public static void Pascal(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf(toHop(i, j) + " ");
            }
            System.out.println("");
        }
    } 
    
    public static int latSo(int n) {
        int tmp = 0;
        while (n != 0) {
            tmp = tmp * 10 + n % 10;
            n /= 10;
        }
        return tmp;
    }
    
}
