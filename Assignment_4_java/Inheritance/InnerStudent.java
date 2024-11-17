package Inheritance;

class Student {

    //Encapsulated...
    private String name;
    private int roll_num;
    private String email_id;
    private long ph_no;
    private String gender ;
    private String fatherName;


   
    // getters....
    public String getName() {
        return name;
    }
    public int getRoll_num() {
        return roll_num;
    }
    public String getEmail_id() {
        return email_id;
    }
    public long getPh_no() {
        return ph_no;
    }
    public String getGender() {
        return gender;
    }
    public String getFatherName() {
        return fatherName;
    }



    //setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll_num(int roll_num) {
        this.roll_num = roll_num;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    public void setPh_no(long ph_no) {
        this.ph_no = ph_no;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }


    
    //parametrized constructor
    public Student(String name, int roll_num, String email_id, long ph_no, String gender, String fatherName) {
        this.name = name;
        this.roll_num = roll_num;
        this.email_id = email_id;
        this.ph_no = ph_no;
        this.gender = gender;
        this.fatherName = fatherName;
    }

    // public void hello()
    // {  
    //     Student("fs",1,"w4r",123l,"4r","r24r");
    // }    
}


class ZSGSStudent extends Student{

    private String pan_number;


    public ZSGSStudent(String name, int roll_num, String email_id, long ph_no, String gender, String fatherName,
            String pan_number)
    {
                
        super(name, roll_num, email_id, ph_no, gender, fatherName);     //calling parent class's parameterized constructor

        this.pan_number = pan_number;        
    }

   
    public String getPan_number() {
        return pan_number;
    }
    public void setPan_number(String pan_number) {
        this.pan_number = pan_number;
    }


    @Override
    public String toString() {
        return "ZSGSStudent [pan_number=" + pan_number + ", Name=" + getName() + ", Roll_num=" + getRoll_num()
                + ",Email_id=" + getEmail_id() + ", Ph_no=" + getPh_no() + ", Gender=" + getGender()
                + ", FatherName=" + getFatherName() + ", Pan_number=" + getPan_number() + "]";
    }
    
}
public class InnerStudent {

    public static void main(String[] args) {
       /* ZSGSStudent obj=new Student("Alice",97,"Alice@example.com",9876543210l,"Female","Someone");
       * cannot create child's object with parent's constructor...like the above. except this, all other 
       * combinations are possible.
       */

       Student obj=new ZSGSStudent("Alice",97,"Alice@example.com",9876543210l,"Female","Someone","CBC98789423565");     // parent reference holds child object

       System.out.println(obj.toString());
    }
}