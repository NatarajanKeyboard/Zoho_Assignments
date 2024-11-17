package Method_Overloading;


class Person
{
    // Encapsulation
    private String name;
    private int age;
    private String address;
    

    // Constructor Overloading
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Getters...
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    // Setters..
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // behaviour
    public void details()
    {
        System.out.println("Name: "+this.name);
        if(this.age!=0)
        {
            System.out.println("Age: "+this.age);
        }
        if(this.address!=null)
        {
            System.out.println("Address: "+this.address);
        }
        System.out.println();
    }



}

public class MainPerson {
    public static void main(String[] args) {
        Person person1=new Person("Roohi san");
        Person person2=new Person("Nadimuthu san", 30);
        Person person3=new Person("Thamarai san", 25, "Somewhere in Potheri to Guduvancherry");

        person1.details();
        person2.details();
        person3.details();


    }
}
