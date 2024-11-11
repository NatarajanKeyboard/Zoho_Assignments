package Constructors;

class Book {

    // just to count the serial numbers...
    static long sl_no;


    // just for Encapsulation....
    private String title;
    private long ISBN;
    private String author;


    

    // constructor
    public Book() {
        sl_no++;            // increases the sl.no whenever new object is created!
    }

    //parameterized constructor      (to initialize the feilds...)
    public Book(String title, long iSBN, String author) {
        sl_no++;
        this.title = title;
        ISBN = iSBN;
        this.author = author;
    }



    //   getters
    public String getTitle() {
        return title;
    }
    public long getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return author;
    }
    
    

    
    //  setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN(long iSBN) {
        ISBN = iSBN;
    }
    public void setAuthor(String author) {
        this.author = author;
    }




    // displays all the books of a given bookshelf
    public static void displayAllBooks(Book[] bookShelf)
    {
        for(int i=0;i<bookShelf.length;i++)
        {
             System.out.println(bookShelf[i].display());
            
            
             // System.out.println(Book.display(bookShelf[i]));     // an alternative way
        }
        System.out.println("Total :"+sl_no+"\n\n\n");
    }


    // displays a single entity (i.e) book
    public String display()
    {
        return "The Title : "+this.title+
                "\nThe ISBN  : "+this.ISBN+
                "\nThe Author: "+this.author+
                "\n \n";
    }

    // public static String display(Book b)             //How display would be for that alternative way....
    // {
    //     return "The Title : "+b.title+
    //             "\nThe ISBN  : "+b.ISBN+
    //             "\nThe Author: "+b.author+
    //             "\n \n";
    // }



    // @Override
    // public String toString()
    // {
    //     return "This object is from"+(this.getClass()+"").substring(5);
    // }

    // public String toString(String a)         // just demonstrated me how to overload...
    // {
    //     return getClass()+a ;
    // }
    
   
}

public class Ques_1_Book_constructor{

    
    public static void main(String[] args) {
        


        Book[] bookShelf_1=new Book[10]; 
        for(int i=0;i<10;i++)
        {
            bookShelf_1[i]=new Book("The art of learning Java "+(i+1),978_3_16_345410_0L+i+1,"Thamarai san");
        }

        Book.displayAllBooks(bookShelf_1);


        // Book ob1=new Book();
        // ob1.setAuthor("nattu");
        // ob1.setISBN(978_3_16_148410_0L);
        // ob1.setTitle("summa");

        
        // Book ob2=new Book("hattu",978_3_16_345410_0L,"mass");
        
        // System.out.println(Book.sl_no);


        // System.out.println(ob1.getAuthor());
        // System.out.println(ob1.getTitle());
        // System.out.println(ob1.getISBN());

        // System.out.println(ob2);
        // System.out.println(ob2.toString());
        // System.out.println(ob2.toString("world"));
        // System.out.println(ob2.getClass()+"hello world");
        // System.out.println(ob2.hashCode());   
        
        

        
    }
}