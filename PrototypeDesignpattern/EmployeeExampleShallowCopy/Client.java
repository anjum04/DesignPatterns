package PrototypeDesignpattern.EmployeeExampleShallowCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address();
        address.city="Bangalore";
        Employee emp1 = new Employee(1,"anjum",25,address);
        Employee emp2 = (Employee) emp1.clone();
        emp2.address.city="Hyderabad";
        emp1.showDetails();
        emp2.showDetails();
    }
}
