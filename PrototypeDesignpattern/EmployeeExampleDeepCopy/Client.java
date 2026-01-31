package PrototypeDesignpattern.EmployeeExampleDeepCopy;

public class Client {
    public static void main(String[] args) {
        Address address = new Address();
        address.city="Bangalore";
        Employee emp1 = new Employee(1,"anjum",25,address);

        Employee emp2 = emp1.getClone();
        emp2.address.city="Hyderabad";
        emp1.showDetails();
        emp2.showDetails();
    }
}
