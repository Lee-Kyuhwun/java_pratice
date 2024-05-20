package construct.ex;

public class Book {

    String title;
    String author;

    int page;
    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book() {
       this("", "", 0);
    }

    void displayInfo() {
        System.out.println("제목 : " + title);
        System.out.println("저자 : " + author);
        System.out.println("페이지 : " + page);
    }

}
