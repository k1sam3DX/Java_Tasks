package printable;

public class Book implements Printable{
    String bookName;

    public Book(String bookName){
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Название книги: " + this.bookName);
    }
}
