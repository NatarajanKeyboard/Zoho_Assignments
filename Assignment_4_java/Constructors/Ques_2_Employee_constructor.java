package Constructors;

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

}


public class Ques_2_Employee_constructor {
    public static void main(String[] args) {

        Employee[] employees_batch_1=new Employee[10];

        for(int i=0;i<10;i++)
        {
            employees_batch_1[i]=new Employee("name_"+i,(byte)25,"someone"+i+"@example.com",9876_543_210L,"CSE","Software_developer");
      
        }

        Employee.displayAllEmployees(employees_batch_1);
        
    }
}
