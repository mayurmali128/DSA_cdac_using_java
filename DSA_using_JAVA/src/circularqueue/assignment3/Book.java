package circularqueue.assignment3;

public class Book {
    private int bookid;
    private String name;

    public Book(){

    }
    public Book(int bookid, String name){
        this.bookid = bookid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", name='" + name + '\'' +
                '}';
    }
}
