package library.transactions; 
import library.books.Book; 
import library.members.Member; 
import java.util.Date;



public class Transaction {
    private Book book;
    private Member member;
    private Date borrowDate;
    private Date returnDate;

    public Transaction(Book book, Member member, Date borrowDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    // Getters and Setters
    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void returnBook(Date returnDate) {
        this.returnDate = returnDate;
        this.book.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Transaction [book=" + book + ", member=" + member + ", borrowDate=" + borrowDate + ", returnDate=" + returnDate + "]";
    }
}
