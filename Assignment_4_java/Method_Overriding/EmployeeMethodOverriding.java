package Method_Overriding;


class Employee{
    static int sl_no;           // just serial number, not related to any object

    // for Encapsulation puroses...
    private int emp_ID;
    private String name;
    private byte age;
    private String email_ID;
    private long ph_no;
    private String dept_name;
    private String job;
    private float salary;           // new task for overriding

    //constructor
    public Employee()
    {
        sl_no++;
        this.emp_ID=sl_no;          //   every sl_no is the emp_ID
    }

    //paremeterized constructor
    public Employee(String name, byte age, String email_ID, long ph_no, String dept_name, String job) {
        sl_no++;
        this.emp_ID=sl_no;          //  every sl_no is the emp_ID
        this.name = name;
        this.age = age;
        this.email_ID = email_ID;
        this.ph_no = ph_no;
        this.dept_name = dept_name;
        this.job = job;
    }

    //  getters...
    public int getEmp_ID() {
        return emp_ID;
    }
    public String getName() {
        return name;
    }
    public byte getAge() {
        return age;
    }
    public String getEmail_ID() {
        return email_ID;
    }
    public long getPh_no() {
        return ph_no;
    }
    public String getDept_name() {
        return dept_name;
    }
    public String getJob() {
        return job;
    }
    public float getSalary() {
        return this.salary;         //verum salary is also applicable but this.salary is a good practice
    }

    //   setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public void setEmail_ID(String email_ID) {
        this.email_ID = email_ID;
    }
    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }
    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setSalary(float salary) {
        this.salary=salary;
    }

    // dislays all the employees of a given employees table
    public static void displayAllEmployees(Employee[] employees_batch)
    {
        for(int i=0;i<10;i++)
        {
           System.out.println(employees_batch[i].display());
        }

        System.out.println("Total employees:"+sl_no+"\n\n");

    }

    // displays a single entity (i.e) employee
    public String display()
    {
        return  "Emp_ID          : "+this.emp_ID+
                "\nName            : "+this.name+
                "\nEmail ID        : "+this.email_ID+
                "\nPhone number    : "+this.ph_no+
                "\nDepartment name : "+this.dept_name+
                "\nJob role        : "+this.job+
                "\n\n";            
    }

    // new task for Overriding
    public void getEmployeeDetails()
    {
        System.out.println("Emp_ID          : "+this.emp_ID+
                            "\nName            : "+this.name+
                            "\nEmail ID        : "+this.email_ID+
                            "\nPhone number    : "+this.ph_no+
                            "\nDepartment name : "+this.dept_name+
                            "\nJob role        : "+this.job);

    }
}
// new task for Overriding
class HourlyEmployee extends Employee
{
    
    public HourlyEmployee(String name, byte age, String email_ID, long ph_no, String dept_name, String job,byte hours) {
        super(name, age, email_ID, ph_no, dept_name, job);      // code reused from parent class constructor
        setSalary(hours*250);                          // this.setSalary() is good practice but here implicitly done
    }

    @Override
    public void getEmployeeDetails()
    {
        super.getEmployeeDetails();                             // code reused from parent classs method
        System.out.println("Salary          : "+this.getSalary()+"\n\n");
    }

}
//new task for Overriding
class SalariedEmployee extends Employee
{
    public SalariedEmployee(String name, byte age, String email_ID, long ph_no, String dept_name, String job)
    {
        super(name, age, email_ID, ph_no, dept_name, job);      // code reused from parent constructor
        this.setSalary(1_00_000);
    }
    @Override
    public void getEmployeeDetails()
    {
        super.getEmployeeDetails();                             // code reused from parent classs method
        System.out.println("Salary          : "+this.getSalary()+"\n\n");
    }
}

public class EmployeeMethodOverriding {
    public static void main(String[] args) {

        // Employee[] employees_batch_1=new Employee[10];

        // for(int i=0;i<10;i++)
        // {
        //     employees_batch_1[i]=new Employee("name_"+i,(byte)25,"someone"+i+"@example.com",9876_543_210L,"CSE","Software_developer");
      
        // }

        // Employee.displayAllEmployees(employees_batch_1);
        
        // new updated task
        Employee natarajan=new SalariedEmployee("Natarajan",(byte)21,"natarajankeyboard@gmail.com",9894_177_175l,"CSE","Software developer");

        Employee prathosh=new HourlyEmployee("Prathosh",(byte)22,"prathosh@gmail.com",9764318520l,"EEE","Electrical Engineer",(byte)5);

        natarajan.getEmployeeDetails();
        prathosh.getEmployeeDetails();

    }
}

