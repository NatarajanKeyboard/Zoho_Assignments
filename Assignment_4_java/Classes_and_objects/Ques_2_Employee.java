package Classes_and_objects;

class Employee {

    static int sl_no;


    //for Encapsulation puroses...
    private int emp_ID;
    private String name;
    private byte age;
    private String email_ID;
    private long ph_no;
    private String dept_name;
    private String job;

    
    public Employee()
    {
        sl_no++;
        this.emp_ID=sl_no;          //   every sl_no is the emp_ID
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

}
// public class Ques_2_Employee {

//     public static void main(String[] args) {
//         Employee ob1=new Employee();
//         ob1.setName("nattu");
//         ob1.setPh_no(978_316_1484L);
//         ob1.setEmail_ID("summa@example.com");
        

//         System.out.println("SL.no "+"| Emp_ID "+"| Name "+"| age "+"| email_ID ");
//         System.out.println("-----------------------------------------------");
        
//         System.out.println(Employee.sl_no+"     |"+ob1.getEmp_ID()+"       |"+ob1.getName()+" | "+ob1.getAge()+"   | "+ob1.getEmail_ID());

//         Employee ob2=new Employee();
//         System.out.println(Employee.sl_no+"     |"+ob2.getEmp_ID()+"       |"+ob2.getName()+"  | "+ob2.getAge()+"   | "+ob2.getEmail_ID());        
//     }
// }