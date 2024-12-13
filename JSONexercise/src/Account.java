public class Account {
    int AcntNumber;
    String balance;
    String AcntName;

    private static int instanceCount = 0;

    public int getAcntNumber() {
        return AcntNumber;
    }

    public void setAcntNumber(int acntNumber) {
        AcntNumber = acntNumber;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAcntName() {
        return AcntName;
    }

    public void setAcntName(String acntName) {
        AcntName = acntName;
    }

    public Account(){
        instanceCount++;
    }
    public Account(String name, String bal){
        this.AcntName = name;
        this.balance = bal;
        instanceCount++;
    }
    public Account(int num){
        this.AcntNumber = num;
        instanceCount++;
    }
    public Account(String name, String bal, int num){
        this.AcntName = name;
        this.balance = bal;
        this.AcntNumber = num;
        instanceCount++;
    }


}
