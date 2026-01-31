package PrototypeDesignpattern.EmployeeExampleShallowCopy;

public class Employee  implements Cloneable{
    int id;
    String name;
    int age;
    Address address;
    Employee(int id,String name,int age,Address address){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
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