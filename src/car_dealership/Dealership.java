package car_dealership;

public class Dealership {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tanjou", "Oosaka", 25000);
        Vehicle vehicle = new Vehicle("Honda", "Civic", 10000);
        Vehicle car = new Vehicle("Audi", "R8", 20000);
        Employee emp = new Employee();

        boolean value = car.equals(vehicle);
        System.out.println(value);
        cust1.purchaseCar(vehicle, emp, false);
    }
}