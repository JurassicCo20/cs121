import java.util.Scanner;

public class Menu {
    private Scanner scnr = new Scanner(System.in);
    private Bank bank = new Bank();
    private void createNewAccount(){
        int answer;
        int pin;
        int deposit;
        Customer testbank;

        System.out.print("Are you a new customer? \n1) Yes\n2) No");
        answer = scnr.nextInt();
        if(answer == 1){
            testbank = createNewCustomer();
        }
        else{
            System.out.print("Enter your Customer PIN: ");
            pin = scnr.nextInt();
            testbank = bank.getCustomer(pin);
            if(testbank == null){
                System.out.println("PIN not found");
                displayMenu();
            }
        }
        System.out.print("Enter your deposit: ");
        deposit = scnr.nextInt();
        Account account = new Account(deposit);
        testbank.addAccount(account);
        System.out.printf("New Account Opened: %d", account.getAccountNumber());
    }
    private Customer createNewCustomer(){
        String firstName;
        String lastName;
        int pin;
        System.out.println("Enter your first name: ");
        firstName = scnr.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scnr.nextLine();
        System.out.println("Enter your PIN: ");
        pin = Integer.parseInt(scnr.nextLine());
        Customer newcustomer = new Customer(firstName,lastName,pin);
        bank.addCustomer(newcustomer);
        return newcustomer;
    }
    private void deleteAllAccounts(){
        String name;
        Customer customer;
        int pin;

        System.out.print("Enter your Customer PIN: ");
        pin = Integer.parseInt(scnr.nextLine());
        customer = bank.getCustomer(pin);
        if(customer == null){
            displayMenu();
        }
        else{
            bank.removeCustomer(customer);
        }
        System.out.print("Your account has been removed from the bank registry.");
    }
    private void displayAccount(){
        int customerPin;
        int customerAccount;
        int select;
        Customer testbank;
        Account testcustomer;
        System.out.print("Please enter your PIN: ");
        customerPin = scnr.nextInt();
        testbank = bank.getCustomer(customerPin);
        if(testbank == null){
            System.out.println("PIN is not valid");
            return;
        }
        else{
            String stars = "*".repeat(3);
            System.out.printf("\n%s Active Accounts %s\n", stars, stars);
            System.out.println(testbank.toString());
            System.out.print("Please enter the account number\n" +
                                "of the account you would like to access: ");
            customerAccount = scnr.nextInt();
            testcustomer = testbank.getAccount(customerAccount);
            if(testcustomer == null){
                System.out.println("Account number invalid");
                return;
            }
            else{
                System.out.println(testcustomer.toString());
                while(true){
                    System.out.println("Please make a selection: \n" + "1) Make a deposit\n" + "2) Make a withdrawal\n" + "3) See account balance\n" + "4) Close account\n" + "5) Exit\n >> ");
                    select = scnr.nextInt();
                    if(select == 1){
                        System.out.print("Enter your deposit: ");
                        int depositAmount = scnr.nextInt();
                        testcustomer.depositAmount(depositAmount);
                    }
                    else if(select == 2){
                        System.out.print("Enter how much to withdraw: ");
                        int withdrawAmount = scnr.nextInt();
                        testcustomer.withdrawAmount(withdrawAmount);
                    }
                    else if(select == 3){
                        System.out.println(testcustomer.toString());
                    }
                    else if(select == 4){
                        testbank.removeAccount(testcustomer);
                    }
                    else if(select == 5){
                        System.out.println("Thank you for using BSU Banking App");
                        System.out.println("Goodbye. Exiting...");
                        displayMenu();
                    }
                    else{
                        System.out.println("Invalid entry");
                    }
                }
            }
        }
    }
    public void displayMenu(){
        int select;
        String stars = "*".repeat(9);
        while(true){
            System.out.printf("\n%s MENU %s\n", stars, stars);
            System.out.println("Please make a selection: \n" + "1) Access Account\n" + "2) Open a New Account\n" + "3) Close All Accounts\n" + "4) Exit\n >> ");
            select = scnr.nextInt();
            if(select == 1){
                displayAccount();
            }
            else if(select == 2){
                createNewAccount();
            }
            else if(select == 3){
                deleteAllAccounts();
            }
            else if(select == 4){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid entry");
            }
        }
    }
}
