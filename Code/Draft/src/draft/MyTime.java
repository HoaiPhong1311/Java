
public class MyTime {
    private int h, m, s;
    
    public MyTime(){
        h = m = s = 0;
    }

    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    public void nexth(){
        this.h = (this.h + 1) % 24;
    }
    
    public void nextm(){
        this.m = this.m + 1;
        if(this.m == 60){
            this.m = 0;
            nexth();
        }
    }
    
    public void nexts(){
        this.s = this.s + 1;
        if(this.s == 60){
            this.s = 0;
            nextm();
        }
    }
    
    public void lasth(){
        this.h = (this.h + 23) % 24;
    }
    
    public void lastm(){
        this.m = this.m - 1;
        if(this.m == -1){
            this.m = 59;
            lasth();
        }
    }
    
    public void lasts(){
        this.s = this.s - 1;
        if(this.s == -1){
            this.s = 59;
            lastm();
        }
    }
    
    public String toString(){
        return String.format("%02d", this.h)+":"+ String.format("%02d", this.m)
                +":"+String.format("%02d",this.s);      
    }
}
