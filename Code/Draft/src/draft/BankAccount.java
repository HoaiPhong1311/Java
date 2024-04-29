
class BankAccount {
    private String id, cus_id, stk, pin;
    private long soDu;

    public BankAccount(String id, String cus_id, String stk, String pin, long soDu) {
        this.id = id;
        this.cus_id = cus_id;
        this.stk = stk;
        this.pin = pin;
        this.soDu = soDu;
    }

    public String getStk() {
        return stk;
    }

    public long getSoDu() {
        return soDu;
    }

    public void setSoDu(long soDu) {
        this.soDu = this.soDu + soDu;
    }
    
    public void rutTien(long soDu){
        this.soDu = this.soDu - soDu;
    }

    @Override
    public String toString() {
        return "ID : " + id + "\nCusID : " + cus_id + "\nNumber : " + stk + "\nPIN : " + pin + "\nBalance : " + soDu + "\n-------------------";
    }

}
