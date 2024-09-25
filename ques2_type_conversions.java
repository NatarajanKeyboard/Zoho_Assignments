public class ques2_type_conversions 
{
    public static void double_to_others(){
        
        System.out.println("*****double to other types*****");
        double a=12345.4671567432;
        System.out.println("double:"+a);
    //1.double to int
        int f=(int)a;
        System.out.println("int:"+f);
    //2.double to float
        float b=(float)a;
        System.out.println("float:"+b);
        
    //3.double to long
        long c=(long)a;
        System.out.println("long:"+c);
    
    //4.double to char
        char d=(char)a;
        System.out.println("char:"+d);

    //5.double to short
        short e=(short)a;
        System.out.println("short:"+e);

    //6.double to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);
        
    System.out.println();

    }   
    
    public static void float_to_others()
    {
        System.out.println("*****float to other types*****");
        float a=12345.09245f;                   //if we mention the decimal point, then only "f" needed
        System.out.println("float:"+a);
    //1.float to double
        double f=a;
        System.out.println("double:"+f);
    //2.float to int
        int b=(int)a;
        System.out.println("int:"+b);
        
    //3.float to long
        long c=(long)a;
        System.out.println("long:"+c);
    
    //4.float to char
        char d=(char)a;
        System.out.println("char:"+d);

    //5.float to short
        short e=(short)a;
        System.out.println("short:"+e);

    //6.float to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);
        
    System.out.println();
    }

    public static void long_to_others() {

        System.out.println("*****long to other types*****");
        long a=-9223372036854775807l;            //after 10 digits only we need "L"
        System.out.println("long:"+a);
    //1.long to double
        double f=a;
        System.out.println("double:"+f);
    //2.long to float
        float b=a;
        System.out.println("float:"+b);
        
    //3.long to int
        int c=(int)a;
        System.out.println("int:"+c);
    
    //4.long to char
        char d=(char)a;
        System.out.println("char:"+d);

    //5.long to short
        short e=(short)a;
        System.out.println("short:"+e);

    //6.long to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);
        
    System.out.println();

    }
    public static void int_to_others() {

        System.out.println("*****int to other types*****");
        int a=65;
        System.out.println("int:"+a);
    //1.int to double
        double f=a;
        System.out.println("double:"+f);
    //2.int to float
        float b=a;
        System.out.println("float:"+b);
        
    //3.int to long
        long c=a;
        System.out.println("long:"+c);
    
    //4.int to char
        char d=(char)a;
        System.out.println("char:"+d);

    //5.int to short
        short e=(short)a;
        System.out.println("short:"+e);

    //6.int to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);


    System.out.println();
        

    }
    public static void char_to_others() {

        System.out.println("*****char to other types*****");
        char a='Z';                         //also char a=90; possible
        System.out.println("char:"+a);
    //1.char to double
        double f=a;
        System.out.println("double:"+f);
    //2.char to float
        float b=a;
        System.out.println("float:"+b);
        
    //3.char to long
        long c=a;
        System.out.println("long:"+c);
    
    //4.char to int
        int d=a;
        System.out.println("int:"+d);

    //5.char to short
        short e=(short)a;
        System.out.println("short:"+e);

    //6.int to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);
        
    System.out.println();
    }


    public static void short_to_others() {

        System.out.println("*****short to other types*****");
        short a=32767;
        System.out.println("short:"+a);
    //1.short to double
        double f=a;
        System.out.println("double:"+f);
    //2.short to float
        float b=a;
        System.out.println("float:"+b);
        
    //3.short to long
        long c=a;
        System.out.println("long:"+c);
    
    //4.short to char
        char d=(char)a;                     //explicit because not of size insufficiency, but because of alphabetic
        System.out.println("char:"+d);

    //5.short to int
        int e=a;
        System.out.println("int:"+e);

    //6.short to byte
        byte g=(byte)a;
        System.out.println("byte:"+g);
        
        System.out.println();
    }
    
    public static void byte_to_others() {

        System.out.println("*****byte to other types*****");
        byte a=120;
        System.out.println("byte:"+a);
    //1.byte to double
        double f=a;
        System.out.println("double:"+f);
    //2.byte to float
        float b=a;
        System.out.println("float:"+b);
        
    //3.byte to long
        long c=a;
        System.out.println("long:"+c);
    
    //4.byte to char
        char d=(char)a;             //explicit because not of size insufficiency,but because of alphabetic
        System.out.println("char:"+d);

    //5.byte to short
        short e=a;
        System.out.println("short:"+e);

    //6.byte to int
        int g=a;
        System.out.println("int:"+g);
        
        System.out.println();
    }


    public static void main(String[] args) 
    {   
        byte_to_others();
        short_to_others();
        char_to_others();
        int_to_others();
        long_to_others();
        float_to_others();
        double_to_others();
        
    }
}
