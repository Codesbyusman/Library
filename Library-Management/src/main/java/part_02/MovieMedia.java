package part_02;

public class MovieMedia implements Media {
    private String title = "";
    private String director = "";
    private double price = 0.0;

    // constructor
    MovieMedia(String title, String director, double price){
        this.title = title;
        this.director = director;
        this.price = price;
    }

    @Override
    public void updatePrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    // setter and getters
    public String getTitle(){
        return title;
    }

    public String getDirector(){
        return director;
    }
}
