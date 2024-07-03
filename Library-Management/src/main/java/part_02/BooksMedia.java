package part_02;

public class BooksMedia implements Media {
    private String title = "";
    private String author = "";
    private double price = 0.0;

    // constructor
    BooksMedia(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // setter and getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
//
//    public void setMetadata(Metadata book_metadata){
//        this.metadata = book_metadata;
//    }
//
//    public void displayBookInfo(){
//        System.out.println("Book: Title: " + title + "\nAuthor: " + author + "\n" + metadata.toString());
//    }

    // implementing interface functions

    @Override
    public void updatePrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
       return this.price;
    }
}
