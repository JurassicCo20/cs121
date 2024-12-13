package weekNine;

public class RegularAccount extends BankAccount{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public RegularAccount(String accountHolderName, String accountType, double balance, int age){
        super(accountHolderName,accountType,balance);
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Account Holder: %s\n Age: %d\n Account Type: %s\n Balance: %.2f (Regular Accont)\n", accountHolderName, age, accountType, balance);
    }
}
