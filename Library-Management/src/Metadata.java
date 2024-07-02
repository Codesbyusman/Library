import java.util.ArrayList;

public class Metadata {
    // variables
    private double price;
    private ArrayList<String> categories;
    private int isbn;
    private int pages;


    // constructor
    Metadata(double price, ArrayList<String> categories, int isbn, int pages){
        this.price = price;
        this.categories = new ArrayList<>();
        this.categories.addAll(categories);
        this.isbn = isbn;
        this.pages = pages;
    }

    Metadata(){
        this.price = 0.0;
        this.categories = new ArrayList<>();
        this.isbn = 0;
        this.pages = 0;
    }



    // setter and getters
    public double getPrice(){
        return price;
    }

    public ArrayList<String> getCategories(){
        return categories;
    }

    public int getIsbn(){
        return isbn;
    }

    public int getPages(){
        return pages;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCategories(ArrayList<String> categories){
        this.categories.addAll(categories);
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String toString(){
        return "Metadata: \n\tPrice: " + price + "\n\tCategories: " + categories.toString() + "\n\tISBN: " + isbn + "\n\tPages: " + pages;
    }
}
