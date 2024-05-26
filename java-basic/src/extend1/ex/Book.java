package extend1.ex;

public class Book extends Item{

    public String isbn;

    public String author;

    public Book(String name, int price, String isbn, String author) {
        super(name,price);
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("isbn: " + isbn);
        System.out.println("author: " + author);
    }
}
