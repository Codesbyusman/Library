public class Books {
    private String title = "";
    private String author = "";
    private Metadata metadata;

    // constructor
    Books(String title, String author, Metadata book_metadata){
        this.title = title;
        this.author = author;
//        this.metadata = book_metadata;
        this.metadata = new Metadata();
        this.metadata.setIsbn(book_metadata.getIsbn());
        this.metadata.setPages(book_metadata.getPages());
        this.metadata.setPrice(book_metadata.getPrice());
        this.metadata.setCategories(book_metadata.getCategories());
    }

    // setter and getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Metadata getMetadata(){
        return metadata;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setMetadata(Metadata book_metadata){
        this.metadata = book_metadata;
    }

    public void displayBookInfo(){
        System.out.println("Book: Title: " + title + "\nAuthor: " + author + "\n" + metadata.toString());
    }


}
