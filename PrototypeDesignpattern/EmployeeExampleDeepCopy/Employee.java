package PrototypeDesignpattern.EmployeeExampleDeepCopy;

public class Employee {
    int id;
    String name;
    int age;
    Address address;
    public Employee(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee getClone(){
        Address clonedAddress = new Address(this.address.city);
        return new Employee(id,name,age,clonedAddress);
    }
    public void showDetails(){
        System.out.println("Employee id:"+id+ " name:"+name+" age:"+age + " address:"+address.city);
    }
}
class Address{
    String city;
    public Address(){}
    public Address(String city){
        this.city = city;
    }
}


