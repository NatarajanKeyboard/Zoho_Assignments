package Classes_and_objects;

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
    
    
    
}

// public class Ques_1_Book{

//     public static void main(String[] args) {
//         Book ob1=new Book();
//         ob1.setAuthor("nattu");
//         ob1.setISBN(978_3_16_148410_0L);
//         ob1.setTitle("summa");

        
//         Book ob2=new Book();
//         System.out.println(Book.sl_no);

//         System.out.println(ob1.getAuthor());
//         System.out.println(ob1.getTitle());
//         System.out.println(ob1.getISBN());

//         System.out.println(ob2.getAuthor());        //null
//     }
// }