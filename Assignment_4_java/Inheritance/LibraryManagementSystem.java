package Inheritance;
import java.util.List;
import java.util.ArrayList;

public class LibraryManagementSystem {
    // Encapsulation
    private String userType;
    private String userName;
    private String password;

    // one to many relationship
    private List<User> usersList;//=new ArrayList();
    private List<Book> booksList;//=new ArrayList<>();
    private List<Librarian> librariansList;//=new ArrayList<>();    


    // constructor
    public LibraryManagementSystem(String userType, String userName, String password, List<User> usersList,
            List<Book> booksList, List<Librarian> librariansList) {
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.usersList = usersList;
        this.booksList = booksList;
        this.librariansList = librariansList;
    }


    // Getters...
    public String getUserType() {
        return userType;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public List<User> getUsersList() {
        return usersList;
    }
    public List<Book> getBooksList() {
        return booksList;
    }
    public List<Librarian> getLibrariansList() {
        return librariansList;
    }


    // Setters...
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }
    public void setLibrariansList(List<Librarian> librariansList) {
        this.librariansList = librariansList;
    }


    // behaviours
    public void login(){}
    public void register(){}
    public void logout(){}
}


class User{

    // Encapsulation
    private String name;
    private String id;

    //  one to one relationship
    private Account account;

    // many to many rtelationship
    private List<Book> userBooks;

    // constructor
    public User(String name, String id, Account account, List<Book> userBooks) {
        this.name = name;
        this.id = id;
        this.account = account;
        this.userBooks = userBooks;
    }

    // Getters...
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public Account getAccount() {
        return account;
    }
    public List<Book> getUserBooks() {
        return userBooks;
    }


    // setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public void setUserBooks(List<Book> userBooks) {
        this.userBooks = userBooks;
    }


    // behaviour
    public void verify(){}
    public void checkAccount(){}
    public void get_book_info(){}        
}
class staff extends User{
    // Encaspsulation
    private String dept;

    // Constructor
    public staff(String name, String id, Account account, List<Book> userBooks, String dept) {
        super(name, id, account, userBooks);
        this.dept = dept;
    }

    // getter
    public String getDept() {
        return dept;
    }

    // setter
    public void setDept(String dept) {
        this.dept = dept;
    }

    
}
class Student extends User{
    // Encapsulation
    private String class1;

    // Constructor
    public Student(String name, String id, Account account, List<Book> userBooks, String class1) {
        super(name, id, account, userBooks);
        this.class1 = class1;
    }

    // getter
    public String getClass1() {
        return class1;
    }
 
    // setter
    public void setClass1(String class1) {
        this.class1 = class1;
    }

    
}


class Account{

    // Encapsulation
    private short no_borrowed_books;
    private short no_reserved_books;
    private short no_returned_books;
    private short no_lost_books;
    private short fine_amount;

    // Constructor
    public Account(short no_borrowed_books, short no_reserved_books, short no_returned_books, short no_lost_books,
            short fine_amount) {
        this.no_borrowed_books = no_borrowed_books;
        this.no_reserved_books = no_reserved_books;
        this.no_returned_books = no_returned_books;
        this.no_lost_books = no_lost_books;
        this.fine_amount = fine_amount;
    }


    // Getters...
    public short getNo_borrowed_books() {
        return no_borrowed_books;
    }
    public short getNo_reserved_books() {
        return no_reserved_books;
    }
    public short getNo_returned_books() {
        return no_returned_books;
    }
    public short getNo_lost_books() {
        return no_lost_books;
    }
    public short getFine_amount() {
        return fine_amount;
    }


    // Setters...
    public void setNo_borrowed_books(short no_borrowed_books) {
        this.no_borrowed_books = no_borrowed_books;
    }
    public void setNo_reserved_books(short no_reserved_books) {
        this.no_reserved_books = no_reserved_books;
    }
    public void setNo_returned_books(short no_returned_books) {
        this.no_returned_books = no_returned_books;
    }
    public void setNo_lost_books(short no_lost_books) {
        this.no_lost_books = no_lost_books;
    }
    public void setFine_amount(short fine_amount) {
        this.fine_amount = fine_amount;
    }

    // behaviour
    public void calculate_fine(){}
}

class Book{
    // Encapsulation
    private String title;
    private long ISBN;
    private String author;
    private String publication;

    // many to many users relationship
    private List<User> usersOfBooks;

    // Constructor
    public Book(String title, long iSBN, String author, String publication, List<User> usersOfBooks) {
        this.title = title;
        ISBN = iSBN;
        this.author = author;
        this.publication = publication;
        this.usersOfBooks = usersOfBooks;
    }
    
    // Getters...
    public String getTitle() {
        return title;
    }
    public long getISBN() {
        return ISBN;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublication() {
        return publication;
    }
    public List<User> getUsersOfBooks() {
        return usersOfBooks;
    }

    // Setters...
    public void setTitle(String title) {
        this.title = title;
    }
    public void setISBN(long iSBN) {
        ISBN = iSBN;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public void setUsersOfBooks(List<User> usersOfBooks) {
        this.usersOfBooks = usersOfBooks;
    }

    // behaviours
    public void show_DueDt(){}
    public void reservation_status(){}
    public void feedback(){}
    public void book_Request(){}
    public void renw_info(){}
}

class Librarian
{
    // Encapsulation
    private String name;
    private int id;
    private String password;
    private String searchString;


    // one to one relationship
    private LibraryDatabase libraryDatabase;

    // one to many relationship
    private List<Book> librarianBooks;

    // Constructor
    public Librarian(String name, int id, String password, String searchString, LibraryDatabase libraryDatabase,
            List<Book> librarianBooks) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
        this.libraryDatabase = libraryDatabase;
        this.librarianBooks = librarianBooks;
    }
    
    
    // Getters... 
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getPassword() {
        return password;
    }
    public String getSearchString() {
        return searchString;
    }
    public LibraryDatabase getLibraryDatabase() {
        return libraryDatabase;
    }
    public List<Book> getLibrarianBooks() {
        return librarianBooks;
    }


    // Setters...
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
    public void setLibraryDatabase(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public void setLibrarianBooks(List<Book> librarianBooks) {
        this.librarianBooks = librarianBooks;
    }


    // Behaviours
    public void verifyLibrarian(){}
    public void Search(){}
    
}


class LibraryDatabase
{
    // Encapsulation
    private List list_Of_Books=new ArrayList();

    // one to one relationship
    private Librarian librarian;

    // one to many relationship
    private List<Book> libraryDatabaseBooksList;
    private List<Account> libraryDatabaseAccountsList;


    // Constructors
    public LibraryDatabase(List list_Of_Books, Librarian librarian, List<Book> libraryDatabaseBooksList,
        List<Account> libraryDatabaseAccountsList) {
    this.list_Of_Books = list_Of_Books;
    this.librarian = librarian;
    this.libraryDatabaseBooksList = libraryDatabaseBooksList;
    this.libraryDatabaseAccountsList = libraryDatabaseAccountsList;
}

    // Getters...
    public List getList_Of_Books() {
    return list_Of_Books;
}
    public Librarian getLibrarian() {
    return librarian;
}
    public List<Book> getLibraryDatabaseBooksList() {
    return libraryDatabaseBooksList;
}
    public List<Account> getLibraryDatabaseAccountsList() {
    return libraryDatabaseAccountsList;
}

    // Setters
    public void setList_Of_Books(List list_Of_Books) {
        this.list_Of_Books = list_Of_Books;
    }
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    public void setLibraryDatabaseBooksList(List<Book> libraryDatabaseBooksList) {
        this.libraryDatabaseBooksList = libraryDatabaseBooksList;
    }
    public void setLibraryDatabaseAccountsList(List<Account> libraryDatabaseAccountsList) {
        this.libraryDatabaseAccountsList = libraryDatabaseAccountsList;
    }

    
    // behaviours
    public void add(){}
    public void delete(){}
    public void update(){}
    public void display(){}
    public void search(){}
}
