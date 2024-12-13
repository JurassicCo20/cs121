import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();
    public void addCustomer(Customer customer){
        customerArrayList.add(customer);
    }
    public void removeCustomer(Customer customer){
        customerArrayList.remove(customer);
    }
    public Customer getCustomer(int customerPIN){
        Customer foundCustomer = null;
        for(Customer c: customerArrayList){
            if(c.getCustomerPIN() == customerPIN){
                foundCustomer = c;
                break;
            }
        }
        return foundCustomer;
    }
    public ArrayList<Customer> getAllCustomers(){
        return customerArrayList;
    }
}
