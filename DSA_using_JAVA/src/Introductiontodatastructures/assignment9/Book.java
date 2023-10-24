package Introductiontodatastructures.assignment9;

public class Book {
    private int bookId;
    private String bookName;
    private double price;

    Book(){

    }

    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public void setData(int bookId, String bookName, double price){
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public void swap(Book obj){
        this.bookId = obj.bookId;
        this.bookName = obj.bookName;
        this.price = obj.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
