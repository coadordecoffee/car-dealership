package car_dealership;

public class Employee {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance == true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }else if (vehicle.getPrice()<=cust.getCashOnHand()){
            processTransaction(cust, vehicle);
            }
        else {
            System.out.println("Insufficient funds");
        }

    }
    public void runCreditHistory(Customer cust, double loanAmount){
        System.out.println("Ran credit history for Customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer " + cust.getName() + " has purchased the vehicle " + vehicle + " for the price " + vehicle.getPrice());
    }
}
