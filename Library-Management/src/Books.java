public class Books {
    private String title = "";
    private String author = "";
    private Metadata book_metadata;

    // constructor
    Books(String title, String author, Metadata book_metadata){
        this.title = title;
        this.author = author;
        this.book_metadata = new Metadata();
        this.book_metadata.setIsbn(book_metadata.getIsbn());
        this.book_metadata.setPages(book_metadata.getPages());
        this.book_metadata.setPrice(book_metadata.getPrice());
        this.book_metadata.setCategories(book_metadata.getCategories());
    }

    // setter and getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Metadata getMetadata(){
        return book_metadata;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setMetadata(Metadata book_metadata){
        this.book_metadata = book_metadata;
    }

    public void displayBookInfo(){
        System.out.println("Book: Title: " + title + "\nAuthor: " + author + "\n" + book_metadata.toString());
    }


}
