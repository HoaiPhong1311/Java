
public class NhanVat {
    private int power, blood;
    private boolean alive;

    public NhanVat(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }
    
    public void mushroom(){
        if(alive){
            blood -= 15;
            power -= 2;
            if(blood <= 0 || power <= 0){
                alive = false;
                blood = power = 0;
            }
        }
    }
    
    public void witch(int x){
        if(alive){
            if(x >= power){
                alive = false;
                blood = power = 0;
            }
            else power += 5;
        }
    }
    
    public void pea(){
        if(alive){
            blood += 10;
            power += 2;
        }
    }
    
    public void soldier(int x){
        if(alive){
            if(x >= power){
                alive = false;
                blood = power = 0;
            }
            else{
                blood += 5;
                power += 7;
            }
        }
    }
    
    public String toString(){
        String tmp = "ALIVE";
        if(!alive) tmp = "DEAD";
        return "POWER : " + power + "\nBLOOD : " + blood + "\n" + tmp + "\n--------------------";
    }
}
